package atividade1;

public class Evento {
private String Time1, Time2;
private double Entrada1,Ent_Emp,Entrada2;
private String Titulo;
private Resultado resultado;
public Evento(String titulo ,String time1, String time2, double entrada1, double ent_Emp, double entrada2) {
	super();
	Time1 = time1;
	Time2 = time2;
	Entrada1 = entrada1;
	Ent_Emp = ent_Emp;
	Entrada2 = entrada2;
	Titulo = titulo;
}
public void setResultado(Resultado resultadoj) {
	resultado = resultadoj;
	
}

public Resultado getResultado() {
	return resultado;
}
public String getTime1() {
	return Time1;
}
public void setTime1(String time1) {
	Time1 = time1;
}
public String getTime2() {
	return Time2;
}
public void setTime2(String time2) {
	Time2 = time2;
}
public double getEntrada1() {
	return Entrada1;
}
public void setEntrada1(double entrada1) {
	Entrada1 = entrada1;
}
public double getEnt_Emp() {
	return Ent_Emp;
}
public void setEnt_Emp(double ent_Emp) {
	Ent_Emp = ent_Emp;
}
public double getEntrada2() {
	return Entrada2;
}
public void setEntrada2(double entrada2) {
	Entrada2 = entrada2;
}
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}

}
