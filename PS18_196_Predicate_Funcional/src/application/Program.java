package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
	//versões diferentes formas de imlementar e obter mesmo resultado 
		//Predicate<Product> pred = p -> p.getPrice() >= 100;//Expressão lambda declarada
		//list.removeIf(pred);//Expressão lambda declarada
		list.removeIf(p -> p.getPrice() >= 100);//Expressão lambda inline
		//list.removeIf(Product::staticProductPredicate); //Reference method com método estático
		//list.removeIf(Product::nonStaticProductPredicate);//Reference method com método não estático
		
		//list.removeIf(new ProductPredicate()); //Implementação da interface
		for (Product p : list) {
			System.out.println(p);
		}
	}
}