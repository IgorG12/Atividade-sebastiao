package CampoApp;

public class Bola {
	ParOrdenado posibola;
	private double velhoribo;
	private double velvertbo;
	final private double raiobol;

	public Bola(ParOrdenado posicentro, double velhoribo, double velvertbo, double raiobol) {
		super();
		this.posibola = posicentro;
		this.velhoribo = velhoribo;
		this.velvertbo = velvertbo;
		this.raiobol = raiobol;
	}
	public void setVelhoribo(double velhoribo) {
		this.velhoribo = velhoribo;
	}
	public void setVelvertbo(double velvertbo) {
		this.velvertbo = velvertbo;
	}
	public ParOrdenado getPosibola() {
	return posibola;
}
public double getVelhoribo() {
	return velhoribo;
}
public double getVelvertbo() {
	return velvertbo;
}
public double getRaiobol() {
	return raiobol;
}
	public void movimenta() {
		double movibola = posibola.getX() + velhoribo;
		posibola.setX(movibola);
		movibola = posibola.getY() + velvertbo;
		posibola.setY(movibola);
	}

	public String toString() {
		return "A bola vai da posicao "+ this.posibola.toString()+ "se move a velocidade ("+(velhoribo)+","+(velvertbo)+") pixels por movimento";
	}
}


