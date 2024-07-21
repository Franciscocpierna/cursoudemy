package principal;

import java.util.Locale;
import java.util.Scanner;

import produto.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Product[] vect = new Product[n]; 
		for (int i=0;i<vect.length;i++) { // usar o n ou tamanho do vetor vect.length
           sc.nextLine();
           String name = sc.nextLine();
		   double price = sc.nextDouble();
		   vect[i]= new Product(name,price);
		}   
		double soma = 0;
		for (int i=0;i<vect.length;i++) { // motivo acima
	           soma += vect[i].getPrice(); 
			}   
		double media = soma/vect.length;
		System.out.printf("A MEDIA DOS PREÇOS É: %.2f%n", media);
		
		sc.close();

	}

}
