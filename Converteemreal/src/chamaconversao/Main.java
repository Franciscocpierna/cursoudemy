package chamaconversao;
import java.util.Locale;
import java.util.Scanner;
import  converteemreal.ConverteemReal;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre com a cotação do Dolar: $ ");
      ConverteemReal.dolar  = sc.nextDouble();
      System.out.print("Entre com total de dolares: $ " );
      ConverteemReal.dolares = sc.nextDouble();
      System.out.printf("Valor a pagar com iof: R$ %.2f",ConverteemReal.calculareal(ConverteemReal.dolar, ConverteemReal.dolares));
      
             
	}

}
