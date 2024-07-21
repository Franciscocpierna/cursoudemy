package numerosnegativos;
import java.util.Locale;
import java.util.Scanner;
public class Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.print("entre com um número negativo ou positivo: ");
		int n = sc.nextInt();
		int[] nega = new int[n]; 
         for (int i=0;i<n;i++) {
        	 
        	 nega[i]=sc.nextInt();
        	 
         }
         System.out.println("Números negativos");
         for (int i=0;i<n;i++) {
        	 if (nega[i] < 0) {
        	                  
        	  System.out.println(nega[i]);
        	 
        	
        	 }
         }
         sc.close();
	}

}
