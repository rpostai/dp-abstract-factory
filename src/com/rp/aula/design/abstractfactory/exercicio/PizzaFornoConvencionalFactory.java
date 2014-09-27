package com.rp.aula.design.abstractfactory.exercicio;

public class PizzaFornoConvencionalFactory implements ProdutoFactory {

	@Override
	public Pizza criaPizza() {
		return new PizzaFornoConvencional();
	}

	@Override
	public Esfirra criaEsfirra() {
		return new EsfirraFornoConvencional();
	}

}
