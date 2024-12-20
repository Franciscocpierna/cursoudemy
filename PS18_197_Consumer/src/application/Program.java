package application;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;
public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new PriceUpdate());//implementado com interface
		//list.forEach(System.out::println);//implementado com interface
	    //list.forEach(Product::staticPriceUpdate);//Reference method com método estático
	    //list.forEach(Product::nonstaticPriceUpdate);//Reference method com método não estático
		//Consumer<Product> cons = p-> p.setPrice(p.getPrice()*1.1);//Expressão lambda declarada
		//list.forEach(cons);//Expressão lambda declarada
		list.forEach(p->p.setPrice(p.getPrice()*1.1));//Expressão lambda inline
		
	    list.forEach(System.out::println);
	}
}