package br.uern.di.poo.unidade1.construcao;

public class Calcserv {

public static double calcserv(Portas poortas) {
	final double percent=0.1;
	final double valorm2= 70;
	final double adicionalbivo= 250.00;
	double valorin = poortas.calculaprec();
	tipoporta port = poortas.getTipoporta();
	double valor = port.getValor();
	double larg = poortas.getLarg();
	double alt = poortas.getAlt();
	double multi = larg*alt*valorm2;
	valorin=+ multi;
	if(poortas.getBivorante()) {
		valorin = valorin+poortas.getBbivorante();
	}
	if(port == tipoporta.Portaluxo) {
		valorin=valorin*percent+valorin;
	}
	return valorin;
}
}
