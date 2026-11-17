package lanchonete;

import java.math.BigDecimal;

public class Refrigerante implements Bebida {

	@Override
	public String getNome() {
		return "Refrigerante";
	}

	@Override
	public BigDecimal getPreco() {	
		return new BigDecimal("12.99");
	}

}
