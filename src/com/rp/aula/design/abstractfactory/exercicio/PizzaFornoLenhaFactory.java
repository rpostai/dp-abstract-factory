package com.rp.aula.design.abstractfactory.exercicio;

public class PizzaFornoLenhaFactory implements ProdutoFactory {

	@Override
	public Pizza criaPizza() {
		return new PizzaFornoLenha();
	}

	@Override
	public Esfirra criaEsfirra() {
		return new EsfirraFornoLenha();
	}

}
