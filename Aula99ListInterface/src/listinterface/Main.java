package listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // List é do tipo Interface e tem que ser implementada por uma classe no caso ArrayList poderia ser outra
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");
        System.out.println("o tamanho da lista é: "+list.size());
      
        for (String x: list) {
        	System.out.println(x);
        	
        }
        System.out.println("--------------------------------");
        // list.remove("Anna");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0)=='M'); // remoção por predicado usa idéia de lambida
        for (String x: list) {
        	System.out.println(x);
        } 	
        System.out.println("--------------------------------");
        System.out.println("index Of Bob: "+list.indexOf("Bob")); //quando não encontra elemento retorna -1
        System.out.println("--------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
        for (String x: result) {
        	System.out.println(x);
        } 	
        System.out.println("--------------------------------");
        String name= list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
        System.out.println("o primeiro que começa com letra A "+name);
        System.out.println("--------------------------------");
        String name1= list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println("o primeiro que começa com letra J "+name1);
	}
	

}
