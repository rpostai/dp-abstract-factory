package com.rp.aula.design.abstractfactory.exercicio;

import java.math.BigDecimal;

public class EsfirraFornoConvencional implements Esfirra {

	@Override
	public BigDecimal calculaPreco() {
		return new BigDecimal(1);
	}

}
