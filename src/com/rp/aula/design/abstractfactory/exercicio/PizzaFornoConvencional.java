package com.rp.aula.design.abstractfactory.exercicio;

import java.math.BigDecimal;

public class PizzaFornoConvencional implements Pizza {

	@Override
	public BigDecimal calculaPreco() {
		return new BigDecimal("35");
	}

}
