package com.rp.aula.design.abstractfactory;

public class IntelCPU implements CPU {

	@Override
	public void processar() {
		System.out.println("Intel está processando");
	}

}
