package lanchonete;

import java.math.BigDecimal;

public class HamburguerVegano implements Hamburguer {

	@Override
	public String getNome() {
		return "Hambúrguer vegano";
	}

	@Override
	public BigDecimal getPreco() {	
		return new BigDecimal("22.99");
	}

}
