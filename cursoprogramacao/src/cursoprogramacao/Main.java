package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		String n;
		Scanner sc = new Scanner(System.in);
		/*String x;
		x = sc.next();
        System.out.println("voce digitou o valor "+x);
        sc.close();
          */
		/*int x;
		x= sc.nextInt();
		System.out.println("voce digitou o valor "+x);
		sc.close();*/
	
		double x;
		System.out.print("Entre com o numero:");
		x= sc.nextDouble();
		n= sc.next();
		System.out.printf("voce digitou o valor: %.2f%n ",x);
		System.out.println("vc digitou:"+n);
		sc.close();
	}

}
