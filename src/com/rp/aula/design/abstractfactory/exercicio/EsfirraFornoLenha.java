package com.rp.aula.design.abstractfactory.exercicio;

import java.math.BigDecimal;

public class EsfirraFornoLenha implements Esfirra {

	@Override
	public BigDecimal calculaPreco() {
		return new BigDecimal(2);
	}

}
