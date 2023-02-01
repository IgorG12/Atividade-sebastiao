package CampoApp;

public class ParOrdenado {
private double x;
private double y;
public ParOrdenado(double x, double y) {
	super();
	this.x = x;
	this.y = y;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
	
}
@Override
public String toString() {
	return "("+ this.x +"," + this.y+")";
}
}
