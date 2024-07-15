package dados;

import java.util.Locale;
import java.util.Scanner;
import dados.DadosAcesso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DadosAcesso acesso = new DadosAcesso();
		System.out.println("Entre com número da conta: ");
		int conta = sc.nextInt();
		acesso.setConta(conta);
		System.out.println("Entre com Nome: ");
		String name = sc.next();
		acesso.setName(name);
		System.out.println();
		System.out.println("Entre com Valor:");
		Double valor = sc.nextDouble();
		System.out.println("Valor é inicial: ");
		//DadosAcesso acesso = new DadosAcesso(conta, name, valor);
		String confirma = sc.next();
		confirma=confirma.strip();
		if (confirma.equals("y"))  {
			
			acesso.setSaldoAtual(valor);
		}			
		System.out.println("Account data"+acesso);
		System.out.println();
		System.out.println("Entre com Deposito: ");
		double deposito = sc.nextDouble();
		acesso.addDeposito(deposito);
		System.out.println("Updade Account data: "+acesso);
		System.out.println();
		System.out.println("Entre com Saque: ");
		double saque = sc.nextDouble();
		acesso.SaqueConta (saque);
		
		System.out.println("Updade Account data: "+acesso);
		
		
		
			
		
		
	}

}
