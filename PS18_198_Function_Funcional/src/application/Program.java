package application;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;
//import util.PriceUpdate;
public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
	    //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());//Implementação da interface
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());//Reference method com método estático
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());//Reference method com método não estático
		
		//Function <Product, String> func = p->p.getName().toUpperCase();//Expressão lambda declarada
		//List<String> names = list.stream().map(func).collect(Collectors.toList());//Expressão lambda declarada
		
		List<String> names = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());//Expressão lambda inline
		names.forEach(System.out::println);
		
	}
}