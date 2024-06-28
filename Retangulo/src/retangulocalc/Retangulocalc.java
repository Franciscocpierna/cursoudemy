package retangulocalc;

public class Retangulocalc{
	public double ladoMaior;
	public double ladoMenor;
	public int status;
	
	public double area() {
        this.status = 1; 
		return ladoMaior*ladoMenor;
	}
		
		
	
	
	public double perimetro() {
		this.status = 2; 
		return 2*ladoMaior+2*ladoMenor;
	}
	
	public double diagonal() {
		this.status = 3; 
		return Math.sqrt(ladoMaior * ladoMaior + ladoMenor * ladoMenor);
	}
	
	
	/*public String toString() {
          	 return " a Área é : " + String.format("%.2f",area())
   	         + " o Perimetro é : " + String.format("%.2f",perimetro())
   	         +" A diagoal é : "+ String.format("%.2f",diagonal());
            
	}*/
   
public String toString() {
		if(this.status==1) {
     	 return " a Área é : " + String.format("%.2f",area());
		}
     	else if(this.status==2) { 
	         return " o Perimetro é : " + String.format("%.2f",perimetro());
     	 }
	     else {    
	         return    " A diagonal é : "+ String.format("%.2f",diagonal());
	     }    
} 

}
	
	
	
