package circ;

public class Calculacirc {
	 public  final double PI=3.14159;
	 
	 public double circunferencia(double radius) {
		 return 2*radius*PI;
	 }
	 public  double volume(double radius) {
		 return 4*PI*radius*radius*radius / 3;
	 }
}
