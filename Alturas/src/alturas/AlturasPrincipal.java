package alturas;

import java.util.Locale;
import java.util.Scanner;

import entidade.Alturas;


public class AlturasPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		Alturas alturas = new Alturas();
		System.out.print("Entre com numero de pessoas: ");
        int n = sc.nextInt();
        String[] name = new String[n]; 
        int[] idade= new int[n]; 
        double[] altura = new double[n];
        Alturas[] altu = new Alturas[n];
        double mediaaltura=0;
        int idademenor16=0;
        double porcentagem =1;
       
        for(int i=0;i<n; i++ ) {
        	sc.nextLine();
        	System.out.println("Entre com nome:");
        	name[i]= sc.nextLine();
        	 
        	System.out.print("Entre com idade:");
        	idade[i]= sc.nextInt();
        	 
        	System.out.print("Entre com Altura:");
        	altura[i] = sc.nextDouble();
        	
        	//Product product = new Product(name,price);
          	altu[i] = new Alturas(name[i],idade[i],altura[i]);
          	//altu[i].getNome();
          	mediaaltura+=altu[i].getAltura();
          	if (altu[i].getIdade()<16) {
          		idademenor16+=1; 
          	}
          	
             } 
        for(int i=0;i<n; i++ ) {
        	if (altu[i].getIdade()<16) {
             System.out.println("Dados da "+i+"a pessoa "); 		
          	 System.out.println("Nome: "+altu[i].getNome()); 
          	 System.out.println("Idade: "+altu[i].getIdade());
             System.out.printf("Altura: %.2f%n ",altu[i].getAltura()); 
          	 
          	}
        	
        }
        mediaaltura=mediaaltura/n;
        System.out.printf("A media de Alura é: %.2f%n ",mediaaltura);
        porcentagem=idademenor16*100/n;
        System.out.printf("a porcentagem de menores de 16 anos é %.2f%n: ",porcentagem);
        
        
        sc.close();   
	}

}
