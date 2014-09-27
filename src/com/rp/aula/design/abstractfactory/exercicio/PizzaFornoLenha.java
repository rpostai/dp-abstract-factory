package com.rp.aula.design.abstractfactory.exercicio;

import java.math.BigDecimal;

public class PizzaFornoLenha implements Pizza {

	@Override
	public BigDecimal calculaPreco() {
		return new BigDecimal("50");
	}

}
