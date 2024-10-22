package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       Map<String, Integer> votos = new HashMap<>();
       System.out.println("Entre com o nome arquivo:");
       String caminho  = sc.nextLine();
       caminho = caminho.trim();
       BufferedReader outro = null;
	   FileReader novo = null;
	   try {
          novo = new FileReader(caminho);
	      outro = new BufferedReader(novo);
	      String line = outro.readLine();
	      while (line != null) {
	    	  String[] campo = line.split(",");
			  String nome = campo[0];
			  int contador = Integer.parseInt(campo[1]);
	    	  if (votos.containsKey(nome)) {
	    		  int valor = votos.get(nome);
	    		  votos.put(nome, valor+contador); 
	    	  }else {
	    		  votos.put(nome, contador);
	            }
	    	  line = outro.readLine();
	      }
          
	      for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}  
	   }catch(IOException e) {
		  System.out.println("Erro: "+ e.getMessage()); 
		   
	   }
	   
       sc.close();
       try {
    	   novo.close();
	   } catch (Exception e) {
		   System.out.println("Erro: "+ e.getMessage());
	   }
       
	}

}


/* professor
package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votes = new LinkedHashMap<>();
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
*/