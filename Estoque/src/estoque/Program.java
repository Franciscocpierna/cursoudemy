package estoque;
import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   Produto produto = new Produto();
	   System.out.println("Entre com os dados do produto: ");
	   System.out.print("Nome: ");
	   produto.nomeprod = sc.nextLine();
	   System.out.print("preço: ");
	   produto.precoprod = sc.nextDouble();
	   System.out.print("Quantidade no Estoque: ");
	   produto.quantidade = sc.nextInt();
	  // System.out.println(produto.nomeprod+ ","+ produto.precoprod +","+produto.quantidade);
	   System.out.println(produto);
	   sc.close();
	   
	}

}
