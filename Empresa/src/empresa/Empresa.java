package empresa;

import java.util.Scanner;
import java.util.Locale;
import entidade.Funcionario;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario(); 
		System.out.print("Nome:");
		funcionario.nome = sc.nextLine();
        System.out.println("Salário Bruto: ");
		funcionario.salarioBruto= sc.nextDouble();
		System.out.println("Imposto: ");
		funcionario.imposto= sc.nextDouble();
		System.out.print("nome Salario Liquido  "+ funcionario.nome+" $ ");
		System.out.printf(" %.2f%n" ,funcionario.salarioLiquido());
		
		//System.out.println("Porcentagem: ");
		//funcionario.porcentagem= sc.nextDouble();
		funcionario.porcentagem=10;
		funcionario.salarioNovo(funcionario.porcentagem);
		System.out.println(funcionario);
		
	}

}
