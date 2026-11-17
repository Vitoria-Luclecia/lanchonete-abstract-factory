package lanchonete;

public class ComboVeganoFactory implements ComboFactory {

    @Override
    public Hamburger criarHamburguer() {
        // Retornar o hamburguer vegetal
        return null;
    }

    @Override
    public Bebida criarBebida() {
        // Retornar o suco natural
        return null;
    }
}