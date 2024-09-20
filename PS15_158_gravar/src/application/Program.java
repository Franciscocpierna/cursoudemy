package application;
import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Program {
public static void main(String[] args) {
	    String[] lines=new String[] {"Bom dia", "Boa tarde", "Boa Noite"};
		String path = "C:\\java_projeto\\out.txt";
		// gravação
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true)))
		{
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
	     }
         catch (IOException e) {
             e.printStackTrace();     	 
         }
		//leitura
		try(BufferedReader br=new BufferedReader(new FileReader(path))) 
		{
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
		    }
		} catch (IOException e) {
		    System.out.println("Error: " + e.getMessage());
		} 
    }
}
