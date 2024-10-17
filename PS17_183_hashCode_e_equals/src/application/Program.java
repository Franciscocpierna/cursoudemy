package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		/*
			hashCode e equals
			• São operações da classe Object utilizadas para comparar se um objeto
			é igual a outro
			• equals: lento, resposta 100%
			• hashCode: rápido, porém resposta positiva não é 100%
			• Tipos comuns (String, Date, Integer, Double, etc.) já possuem
			implementação para essas operações. Classes personalizadas
			precisam sobrepô-las. 
	  
		Equals
		Método que compara se o objeto é igual a outro, retornando
		true ou false.
		*/
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
		
		//HashCode
		//Método que retorna um número inteiro representando um código gerado
		//a partir das informações do objeto
		String a1 = "Maria";
		String b1 = "Alex";
		System.out.println(a1.hashCode());
		System.out.println(b1.hashCode());
		
		/*Regra de ouro do HashCode
		• Se o hashCode de dois objetos for diferente, então os dois objetos são
		diferentes
		• Se o código de dois objetos for igual, muito provavelmente os objetos
		são iguais (pode haver colisão) */
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		System.out.println();
		System.out.println();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // deu falso pq os objetos tem posições diferentes na memoria
		
		//String s1="Test"; //igual true
		//String s2="Test";
		String s1= new String("Test"); // diferente pq objeto resulta falso
		String s2= new String("Test");
		System.out.println();
		System.out.println(s1 == s2); 
	}

}
