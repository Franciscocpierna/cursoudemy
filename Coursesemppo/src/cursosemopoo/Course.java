package cursosemopoo;

import java.util.Locale;
import java.util.Scanner;

import cursocompoo.Triangulo;

public class Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		//double xA,xB,xC,yA,yB,yC;
		//Triangulo x, y;  // declara assim tipo Triangulo
		Triangulo x= new Triangulo(); // ou diretamenyte
		Triangulo y= new Triangulo(); 
        Scanner sc= new Scanner(System.in);
        System.out.print("Entre com  os tres lados do Trianglo X:");
        //xA= sc.nextDouble();
        //xB = sc.nextDouble(); sem poo  os 3
        //xC = sc.nextDouble();
        x.a= sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
       
        //double p = (x.a+x.b+x.c)/2; 
        //double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
        double areaX = x.area(); 
        System.out.printf("Area do triangulo X é: %.4f%n ", areaX);
        System.out.print("Entre com  os tres lados do Trianglo Y:");
        //yA= sc.nextDouble();
        //yB = sc.nextDouble(); semm poo
        //yC = sc.nextDouble();
        y.a= sc.nextDouble();
        y.b= sc.nextDouble(); //com poo
        y.c = sc.nextDouble();
        //p = (y.a+y.b+y.c)/2;  
        //double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
        double areaY = y.area(); 
        System.out.printf("Area do triangulo Y é: %.4f%n ", areaY);
        if (areaX > areaY) {
         System.out.println("A area X é maior que Y");
         
        }else {
        	System.out.println("A area Y é maior que A");
        }
          
        sc.close();
        
	}

}
