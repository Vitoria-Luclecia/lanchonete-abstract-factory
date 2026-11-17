import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<Combo> itens = new ArrayList<>();

    public void adicionar(Combo combo) {
        itens.add(combo);
    }

    public boolean remover(int posicao) { // posição começa em 1
        if (posicao < 1 || posicao > itens.size()) {
            return false;
        }
        itens.remove(posicao - 1);
        return true;
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }

    public int quantidade() {
        return itens.size();
    }

    public double getTotal() {
        double total = 0;
        for (Combo c : itens) {
            total += c.getPreco();
        }
        return total;
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }
        System.out.println("---------- CARRINHO ----------");
        for (int i = 0; i < itens.size(); i++) {
            Combo c = itens.get(i);
            System.out.printf("%d) %s - R$ %.2f%n", i + 1, c.getDescricao(), c.getPreco());
        }
        System.out.printf("TOTAL: R$ %.2f%n", getTotal());
        System.out.println("------------------------------");
    }

    public void limpar() {
        itens.clear();
    }
}
