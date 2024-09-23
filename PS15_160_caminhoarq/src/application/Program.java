package application;
import java.io.File;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		// nome do arquivo
		System.out.println("getName: " + path.getName());
		//só caminho pasta
		System.out.println("getParent: " + path.getParent());
		//caminho todo
		System.out.println("getPath: " + path.getPath());
		
		
		sc.close();
	}
}