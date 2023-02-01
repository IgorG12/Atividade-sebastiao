package atividade1;

public class Aposta {
private Evento quartasf;
private Resultado resultadoj;
private double entrada;
public Aposta(Evento quartasf, Resultado resultadoj, double entrada) {
	super();
	this.quartasf = quartasf;
	this.resultadoj = resultadoj;
	this.entrada = entrada;
}
public Resultado getResultado() {
	return resultadoj;
}
public double calculaLucro(Evento semifinal1) {
	if(resultadoj == semifinal1.getResultado()) {
		if(semifinal1.getResultado() == Resultado.TIME1) {
			return semifinal1.getEntrada1() * entrada;
		}
		if(semifinal1.getResultado() == Resultado.TIME2) {
			return semifinal1.getEntrada2() * entrada;
		}
		if(semifinal1.getResultado()== Resultado.EMPATE) {
			return semifinal1.getEnt_Emp() * entrada;
		}
	}
return 0;
}
public double getValorApostado(){
	return entrada;
}
}
