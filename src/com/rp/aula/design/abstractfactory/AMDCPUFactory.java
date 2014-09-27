package com.rp.aula.design.abstractfactory;

public class AMDCPUFactory implements CPUFactory {

	@Override
	public CPU produzirCPU() {
		return new AMDCPU();
	}

}
