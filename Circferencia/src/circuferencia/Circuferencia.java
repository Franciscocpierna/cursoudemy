package circuferencia;
import java.util.Locale;
import java.util.Scanner;
import circ.Calculacirc;

public class Circuferencia {
    
	public static void main(String[] args) {
		// TODO Auto-generated method
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o Raio: "); 
        double radius = sc.nextDouble();
        Calculacirc calc = new Calculacirc(); 
        double  c=  calc.circunferencia(radius);
        double v=  calc.volume(radius);
        
        System.out.printf("Circunferencia: %.2f%n ", c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI: %.2f%n",calc.PI);
        
	}

	
}
