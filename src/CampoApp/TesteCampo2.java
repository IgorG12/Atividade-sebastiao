package CampoApp;
import java.util.Scanner;
import java.util.Random;
public class TesteCampo2 {
	public static void main(String[] args) {
		System.out.println("informe a largura e a altura do campo: ");
		Scanner camp = new Scanner(System.in);
		System.out.println("Informe a Largura: ");
		double lag = camp.nextDouble();
		System.out.println("Informe a Altura: ");
		double alt = camp.nextDouble();
		System.out.println("Informe qual o raio da bola: ");
		double Rai = camp.nextDouble();
		ParOrdenado Pinicial = new ParOrdenado(0,0);
		Random mixer = new Random();
		double campo = lag + alt;
		double Mi = (5* campo)/100;
		double Ma = (10* campo)/100;
		double VelH = mixer.nextDouble((Ma - Mi)+1) + Mi;
		double VelV = mixer.nextDouble((Ma - Mi)+1)+ Mi;
		Bola boleta = new Bola(Pinicial,VelH, VelV, Rai);
		CampoRetangular CampR =new CampoRetangular(Pinicial,lag,alt,boleta);
		for(int i=0;i<= 30;i++) {
			CampR.movibola();
			System.out.println(i +" : "+ CampR.getBolamov().toString());
		}
	}
}
