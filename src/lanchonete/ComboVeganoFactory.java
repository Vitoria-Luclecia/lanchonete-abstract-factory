package lanchonete;

public class ComboVeganoFactory implements ComboFactory {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerVegano();
    }

    @Override
    public Bebida criarBebida() {
        return new SucoNatural();
    }
}