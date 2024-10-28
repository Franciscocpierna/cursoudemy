package model.sevices;


import java.util.List;
import java.util.function.Predicate;
import model.entities.Product;
public class ProductService {
	public double filteredSum(List<Product> list, Predicate<Product> criteria) { // segunda versão
	//public double filteredSum(List<Product> list) { // primeira versão
		double sum = 0.0;
		for (Product p : list) { // segunda versao recendo criterio como parametro
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		/*for (Product p : list) {
			if (p.getName().charAt(0)== 'T') { // primeira versão
				sum += p.getPrice();
			}
		}*/
		return sum;
	}
}