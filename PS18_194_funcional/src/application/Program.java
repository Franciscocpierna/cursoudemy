package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	public static int compareProducts(Product p1, Product p2) {
     	return p1.getPrice().compareTo(p2.getPrice());
   }
public static void main(String[] args) {
	    //int[] vect = new int[] {3, 4, 5}; essa linha para relembrar declaração de vetor
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.sort(Program::compareProducts);
		list.forEach(System.out::println);
	}

}

/* Expressividade / código conciso
Integer sum = 0;
for (Integer x : list) {
    sum += x;
}
vs.

Integer sum = list.stream().reduce(0, Integer::sum); //funcional linha substitue linhas acima
*/
