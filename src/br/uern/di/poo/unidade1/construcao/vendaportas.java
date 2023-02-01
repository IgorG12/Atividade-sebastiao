package br.uern.di.poo.unidade1.construcao;

public class vendaportas {
	public static void main(String[] args ){
	Portas porta = new Portas();
	Portas porta1 = new Portas(tipoporta.Portasimples,0.6,1.8,false);
	Portas porta2 = new Portas(tipoporta.Portapadrao,0.8,1.7,false);
	Portas porta3 = new Portas(tipoporta.Portaluxo,0.9,1.9,false);
	Portas porta4 = new Portas(tipoporta.Portaluxo,0.8,1.9,true);

	porta1.exibePorta();
	System.out.println("O valor do servico sera: "+Calcserv.calcserv(porta1));
	porta2.exibePorta();
	System.out.println("O valor do servico sera: "+Calcserv.calcserv(porta2));
	porta3.exibePorta();
	System.out.println("O valor do servico sera: "+Calcserv.calcserv(porta3));
	porta4.exibePorta();
	System.out.println("O valor do servico sera: "+Calcserv.calcserv(porta4));
	}
	}
