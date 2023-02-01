package CampoApp;
import java.util.Scanner;
public class TesteCampo {
	private String campo;
	public static void main(String[] args) {
		System.out.println("informe a posicao X do Campo: ");
		Scanner Pbola = new Scanner(System.in);
		double pX = Pbola.nextDouble();
		System.out.println("informe a posicao Y do Campo");
		double pY = Pbola.nextDouble();
		System.out.println("informe a Altura: ");
		double alt = Pbola.nextDouble();
		System.out.println("informe a largura: ");
		double lag = Pbola.nextDouble();
		System.out.println("Informe a posica X da Bola: ");
		double Px = Pbola.nextDouble();
		System.out.println("Informe a posicao Y da Bola: ");
		double Py = Pbola.nextDouble();
		System.out.println("Informe o raio da bola: ");
		double Raio = Pbola.nextDouble();
		System.out.println("Informe a velocidade horizontal da Bola: ");
		double velhori = Pbola.nextDouble();
		System.out.println("Informe a velocidade vertical da Bola: ");
		double velvert =Pbola.nextDouble();
		ParOrdenado Pordenado = new ParOrdenado(Px,Py);
		Bola bolaa = new Bola(Pordenado,velhori,velvert,Raio);
		ParOrdenado camp = new ParOrdenado(pX,pY);
		CampoRetangular CampR = new CampoRetangular(camp,alt,lag,bolaa);
		for(double i = 0;i<= 30;i++) {
			CampR.movibola();
			System.out.println(bolaa.toString());
		}
	}

}
