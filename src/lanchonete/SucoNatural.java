package lanchonete;

import java.math.BigDecimal;

public class SucoNatural implements Bebida {

	@Override
	public String getNome() {
		return "Suco Natural";
	}

	@Override
	public BigDecimal getPreco() {	
		return new BigDecimal("8.50");
	}

}
