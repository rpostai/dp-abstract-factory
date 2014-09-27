package com.rp.aula.design.abstractfactory.exercicio;

public class Sistema {
	
	public static void main(String[] args) {
		
		ProdutoFactory f = new PizzaFornoLenhaFactory();
		System.out.println(f.criaPizza().calculaPreco());
		
		f = new PizzaFornoConvencionalFactory();
		System.out.println(f.criaPizza().calculaPreco());
	}

}
