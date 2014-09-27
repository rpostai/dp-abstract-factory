package com.rp.aula.design.abstractfactory;

public class IntelCPUFactory implements CPUFactory {

	@Override
	public CPU produzirCPU() {
		return new IntelCPU();
	}

}
