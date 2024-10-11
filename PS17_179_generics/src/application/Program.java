package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//PrintService ps = new PrintService();
		//PrintService<Integer> ps = new PrintService<>();
        PrintService<String>  ps = new PrintService<>(); 
		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			//Integer value = sc.nextInt();
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();  
		// agora não precesa fazer casting para integer exemplo  Integer x = (Integer) ps.first();
		//Integer x = ps.first(); usando  Integer ou String mantém toda classe generica no programa PrintService sem mudança 
		String x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	  }
	}