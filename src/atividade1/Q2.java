package atividade1;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;

   public class Q2 {
		public static void main(String[] args)
		throws ParseException{
			String mesd;
		SimpleDateFormat formatom = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Digite a data desejada: ");
		Scanner data = new Scanner(System.in);
		mesd = data.next();
		Date mes = formatom.parse(mesd);
		
		SimpleDateFormat formatoy = new SimpleDateFormat("\n MMMM dd/yyyy");
		String Date = formatoy.format(mes);
		System.out.println(Date);
		}
   }

