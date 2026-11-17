package lanchonete;

public class Combo {

    private Hamburguer hamburguer;
    private Bebida bebida;

    public Combo(ComboFactory factory) {
        this.hamburguer = factory.criarHamburguer();
        this.bebida = factory.criarBebida();
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public Bebida getBebida() {
        return bebida;
    }
}