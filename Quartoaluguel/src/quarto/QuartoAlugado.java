package quarto;

import java.util.Locale;
import java.util.Scanner;

public class QuartoAlugado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =0;
		String[] nome = new String[10];
		String[] email = new String[10];
		int[] quarto = new int[10];
		while (n < 1 || n> 10) { 
		  System.out.print("Entre com o número de alugadores:");	
		  n = sc.nextInt();
		  if (n> 10 || n<0) {
			  System.out.println("Digite um nr entre 1 e 10");
		  }
		  
		}
		
		for (int i=0;i<n;i++) {
			while (quarto[i] < 1 ||quarto[i]> 10) { 
			   System.out.println("entre com o numero do quarto: ");
			   quarto[i] = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.println("entre com o nome: ");
			nome[quarto[i]]= sc.nextLine();
			System.out.println("entre com o E-mail: ");
			email[quarto[i]]=sc.nextLine(); 
		} 
		 
		for(int x=0;x<10;x++) {
			if (nome[x] !=null) {
				sc.nextLine();
				System.out.print(x+" ");
				System.out.print(nome[x]+" ");
				System.out.print(email[x]);
				
			}
		} 	
		
		
		sc.close();
}
}