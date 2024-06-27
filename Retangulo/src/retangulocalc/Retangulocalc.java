package retangulocalc;

public class Retangulocalc{
	public double ladoMaior;
	public double ladoMenor;
	
	
	public double area() {

		return ladoMaior*ladoMenor;
	}
		
		
	
	
	public double perimetro() {

		return 2*ladoMaior+2*ladoMenor;
	}
	
	public double diagonal() {
		
		return Math.sqrt(ladoMaior * ladoMaior + ladoMenor * ladoMenor);
	}
	
	
	public String toString() {
          	 return " a Área é : " + String.format("%.2f",area())
   	         + " o Perimetro é : " + String.format("%.2f",perimetro())
   	         +" A diagoal é : "+ String.format("%.2f",diagonal());
            
	}
   

	}
