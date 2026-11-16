package lanchonete;

import java.math.BigDecimal;

public class HamburguerTradicional implements Hamburguer {

	@Override
	public String getNome() {
		return "Hambúrguer tradicional";
	}

	@Override
	public BigDecimal getPreco() {	
		return new BigDecimal("20.99");
	}

}
