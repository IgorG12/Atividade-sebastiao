package br.uern.di.poo.unidade1.construcao;

public class Portas {
private tipoporta tipoporta;
private double altura;
private double largura;
private boolean bivorante;
private final double Bbivorante = 350.00;
private final double Larg = 0.7;
private final double alt = 1.8;
public Portas() {
	tipoporta = tipoporta.Portasimples;
	largura = Larg;
	altura = alt;
	
}
public Portas(tipoporta tipoporta, double altura, double largura,
		boolean bivorante) {
	super();
	this.tipoporta = tipoporta;
	this.altura = altura;
	this.largura = largura;
	this.bivorante = bivorante;	
}

public tipoporta getTipoporta() {
	return tipoporta;
}
public void setTipoporta(tipoporta tipoporta) {
	this.tipoporta = tipoporta;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getLargura() {
	return largura;
}
public void setLargura(double largura) {
	this.largura = largura;
}
public boolean isBivorante() {
	return bivorante;
}
public void setBivorante(boolean bivorante) {
	this.bivorante = bivorante;
}
public double getBbivorante() {
	return Bbivorante;
}
public double getLarg() {
	return Larg;
}
public double getAlt() {
	return alt;
}
public boolean getBivorante() {
	return bivorante;
}
public double calculaprec() {
	double valor = tipoporta.getValor()*altura*largura;
	if(this.bivorante) {
		return Bbivorante+valor;
	}
	else {
		return (valor);
	}
}
public void exibePorta() {
	System.out.println("O valor da porta sera: "+tipoporta);
	System.out.println("A largura da porta sera :"+largura);
	System.out.println("A altura da porta sera: "+altura);
	System.out.println("se a porta eh bivorante: "+bivorante);
	System.out.println("o valor da porta sera: "+calculaprec());
}
}
