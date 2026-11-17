package lanchonete;

public class ComboTradicionalFactory implements ComboFactory {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerTradicional();
    }

    @Override
    public Bebida criarBebida() {
        return new Refrigerante();
    }
}