package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		List<Pessoa> list = new ArrayList<>();
		System.out.print("Entre com número de contribuinte: ");
		int n;
		String name;
		int numfunc;
		double renda;
		double gastosaude;
	    double soma=0;
		n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Pessoa #" + i + " data:");
			System.out.print("Fisica ou Juridica(fj)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			
			System.out.print("renda Anual: ");
			//sc.nextLine();

			renda = sc.nextDouble();
			
			if (ch == 'f') {
			  System.out.println("Gasto com saúde:");
			  gastosaude = sc.nextDouble(); 
			  list.add(new Fisica(name, renda,gastosaude));
			  
			}else {
			   System.out.println("Nr Funcionário:");
			   numfunc = sc.nextInt();  			  	
			   list.add(new Juridica(name, renda, numfunc));
			   			   
			}   
		}
		
		System.out.println();
		System.out.println("Taxes Paid:");
		for (Pessoa pessoa : list) {
			System.out.print(pessoa.getName()+"  ");
			System.out.println(String.format(" $ %.2f", pessoa.calcimposto()));
			soma+=pessoa.calcimposto();
			
		}
		//System.out.println(String.format("Total Pago: %.2f", soma));
		System.out.printf("Total Pago: $ %.2f",soma);
		
		
		sc.close();

	}

}
