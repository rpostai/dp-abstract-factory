package com.rp.aula.design.abstractfactory;

public class Sistema {

	public static void main(String[] args) {

		CPUFactory amd = new AMDCPUFactory();

		CPUFactory intel = new IntelCPUFactory();

		CPU cpu = criaCPU(amd);
		cpu.processar();

		cpu = criaCPU(intel);
		cpu.processar();

	}

	public static CPU criaCPU(CPUFactory factory) {
		return factory.produzirCPU();
	}

}
