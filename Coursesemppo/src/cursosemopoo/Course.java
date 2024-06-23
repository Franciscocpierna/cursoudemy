package cursosemopoo;

import java.util.Locale;
import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        System.out.print("Entre com  os tres lados do Trianglo X:");
        double xA= sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();
       
        double p = (xA+xB+xC)/2; 
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
       //System.out.println("area = "+ areaX);
        System.out.printf("Area do triangulo X é: %.4f%n ", areaX);
        System.out.print("Entre com  os tres lados do Trianglo Y:");
        double yA= sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();
        p = (yA+yB+yC)/2;  
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
        System.out.printf("Area do triangulo Y é: %.4f%n ", areaY);
        if (areaX > areaY) {
         System.out.println("A area X é maior que Y");
         
        }else {
        	System.out.println("A area Y é maior que A");
        }
          
        sc.close();

	}

}
