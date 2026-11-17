package lanchonete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro(sc, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    adicionarCombo(sc, carrinho, new ComboTradicionalFactory());
                    break;
                case 2:
                    adicionarCombo(sc, carrinho, new ComboVeganoFactory());
                    break;
                case 3:
                    carrinho.listar();
                    break;
                case 4:
                    if (carrinho.estaVazio()) {
                        System.out.println("Carrinho vazio, nada para remover.");
                    } else {
                        carrinho.listar();
                        int pos = lerInteiro(sc, "Número do item a remover: ");
                        if (carrinho.remover(pos)) {
                            System.out.println("Item removido.");
                        } else {
                            System.out.println("Item inválido.");
                        }
                    }
                    break;
                case 5:
                    finalizarPedido(carrinho);
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void exibirMenu() {
        Combo c1 = new Combo(new ComboTradicionalFactory());
        Combo c2 = new Combo(new ComboVeganoFactory());

        System.out.println();
        System.out.println("========== LANCHONETE ==========");
        System.out.printf("1 - %s (R$ %.2f)%n", c1.getDescricao(), c1.getPrecoTotal());
        System.out.printf("2 - %s (R$ %.2f)%n", c2.getDescricao(), c2.getPrecoTotal());
        System.out.println("3 - Ver carrinho");
        System.out.println("4 - Remover item");
        System.out.println("5 - Finalizar pedido");
        System.out.println("0 - Sair");
        System.out.println("================================");
    }

    private static void adicionarCombo(Scanner sc, Carrinho carrinho, ComboFactory fabrica) {
        int qtd = lerInteiro(sc, "Quantidade: ");
        if (qtd <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }
        for (int i = 0; i < qtd; i++) {
            carrinho.adicionar(new Combo(fabrica));
        }
        System.out.println(qtd + "x " + new Combo(fabrica).getDescricao() + " adicionado(s) ao carrinho.");
    }

    private static void finalizarPedido(Carrinho carrinho) {
        if (carrinho.estaVazio()) {
            System.out.println("Carrinho vazio. Adicione itens antes de finalizar.");
            return;
        }
        System.out.println("\n===== PEDIDO FINALIZADO =====");
        carrinho.listar();
        System.out.println("Obrigado pela preferência!");
        carrinho.limpar();
    }

    private static int lerInteiro(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Digite um número válido: ");
        }
        return sc.nextInt();
    }
}