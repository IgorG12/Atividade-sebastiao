package br.uern.di.poo.unidade1.construcao;

public enum tipoporta {
	Portasimples("compensado","simples",50.00),
	Portapadrao("Andiroba", "Encaixe",140.00),
	Portaluxo("ipe","tetra",350.00);
	
	private final String mad;
	private final String feicho;
	private final double valor;
	private tipoporta(String mad, String feicho, double valor) {
		this.mad = mad;
		this.feicho = feicho;
		this.valor = valor;
	}
	public String getMad() {
		return mad;
	}
	public String getFeicho() {
		return feicho;
	}
	public double getValor() {
		return valor;
	}
	
	
	
}
