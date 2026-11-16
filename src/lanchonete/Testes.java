package lanchonete;

import java.math.BigDecimal;

public class Testes {

    public static void main(String[] args) {
        Hamburguer tradicional = new HamburguerTradicional();
        Hamburguer vegano = new HamburguerVegano();
        Bebida refrigerante = new Refrigerante();
        Bebida suco = new SucoNatural();

        verificarProduto("Hambúrguer tradicional", "20.99",
                tradicional.getNome(), tradicional.getPreco());

        verificarProduto("Hambúrguer vegano", "22.99",
                vegano.getNome(), vegano.getPreco());

        verificarProduto("Refrigerante", "12.99",
                refrigerante.getNome(), refrigerante.getPreco());

        verificarProduto("Suco Natural", "8.50",
                suco.getNome(), suco.getPreco());

        System.out.println("Os quatro produtos passaram nos testes.");
    }

    private static void verificarProduto(String nomeEsperado, String precoEsperado,
            String nomeRecebido, BigDecimal precoRecebido) {

        if (!nomeEsperado.equals(nomeRecebido)) {
            throw new AssertionError("Nome esperado: " + nomeEsperado
                    + ". Nome recebido: " + nomeRecebido);
        }

        BigDecimal valorEsperado = new BigDecimal(precoEsperado);

        if (precoRecebido == null || valorEsperado.compareTo(precoRecebido) != 0) {
            throw new AssertionError("Preço incorreto para " + nomeEsperado
                    + ". Esperado: " + valorEsperado + ". Recebido: " + precoRecebido);
        }
    }
}