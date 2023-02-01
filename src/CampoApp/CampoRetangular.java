package CampoApp;

public class CampoRetangular {
	private ParOrdenado psuperioresqdcampo;
	private double comp,altura;
	private Bola bolamov;
	public CampoRetangular(ParOrdenado psuperioresqdcampo, double comp, double altura, Bola bolamov) {
		super();
		this.psuperioresqdcampo = psuperioresqdcampo;
		this.comp = comp;
		this.altura = altura;
		this.bolamov = bolamov;
	}
	public ParOrdenado getPsuperioresqdcampo() {
		return psuperioresqdcampo;
	}


	public double getComp() {
		return comp;
	}


	public double getAltura() {
		return altura;
	}


	public Bola getBolamov() {
		return bolamov;
	}


	public boolean bolasup() {
		if(altura/2 <= bolamov.getPosibola().getX()+bolamov.getRaiobol())
			return true;
		return false;
	}
	public boolean bolainf() {
		if(-altura/2 >= bolamov.getPosibola().getX()+ bolamov.getRaiobol())
			return true;
		return false;
	}
	public boolean bolaesq() {
		if(-comp/2 >= bolamov.getPosibola().getY() + bolamov.getRaiobol())
			return true;
		return false;
	}
	public boolean boladir() {
		if(comp/2 <= bolamov.getPosibola().getY() + bolamov.getRaiobol())
			return true;
		return false;
	}
	public void movibola() {
		if(bolasup()) {
			bolamov.setVelvertbo(-1 * bolamov.getVelvertbo());
		}
		else if(bolaesq()) {
			bolamov.setVelhoribo(-1 * bolamov.getVelhoribo());
	    }
		else if(bolainf()) {
			bolamov.setVelvertbo(-1 * bolamov.getVelvertbo());
		}
		else if(boladir()) {
			bolamov.setVelhoribo(-1 * bolamov.getVelhoribo());
		}
		bolamov.movimenta();
	}
}