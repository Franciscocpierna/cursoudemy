package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import entities.Funcionario;
public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in); 
		//List<String> list = new ArrayList<>(); // List é do tipo Interface e tem que ser implementada por uma classe no caso ArrayList poderia ser outra
		List<Integer> list = new ArrayList<>();
		System.out.print("Entre com Números de funcionários: ");
		int n = sc.nextInt();
		String nome;
		double salario;
		double porcento;
		int id;
		Funcionario[] func = new Funcionario[n];
		for(int x=0; x<n;x++) { 
		   sc.nextLine();
		   System.out.println("#" + (x+1));
		   System.out.print("ID: ");
		   id = sc.nextInt();
		   sc.nextLine();
		   System.out.print("Nome: ");
		   nome = sc.nextLine();
		   System.out.printf("Salário: ");
		   salario= sc.nextDouble();
		   func[x]= new Funcionario(id,nome,salario);
		   list.add(id);
		   
		   
		}
		
		System.out.print("Entre com Número do Id do funcionário reajuste: ");
		 int z = sc.nextInt();
		 z=list.indexOf(z);
		 
		 if (z!=-1){
			 System.out.print("Entre com porcentagem reajuste: ");
			 porcento = sc.nextDouble();
    		 func[z].aumentoSalario(porcento);
			 //System.out.println("o funcionário id " +func[z].getId()+" Nome: "+func[z].getNome());
			// System.out.printf("salario Atual: %.2f%n", func[z].getSalario());
		 }else {
			 System.out.println("Esse Funcionario não existe: ");  
		 } 
		System.out.println(); 
		System.out.println("Lista de funcionários ");
		for(int i=0; i<n;i++) {
			System.out.println();
			System.out.print(func[i].getId()+" "+func[i].getNome());
			System.out.printf("  %.2f", func[i].getSalario());
		} 
	
      
		
		        
     
	}
	

}
