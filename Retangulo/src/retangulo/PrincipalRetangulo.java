package retangulo;
import java.util.Locale;
import java.util.Scanner;
import retangulocalc.Retangulocalc;;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulocalc retangulo = new Retangulocalc();
		System.out.println("Area  Largura and Altura:");
		retangulo.ladoMaior = sc.nextDouble();
		retangulo.ladoMenor = sc.nextDouble();
		//retangulo.status =1;
		System.out.println("Dados do Retangulo atualizado: "+retangulo);
		retangulo.status =3;
		//System.out.println("Dados do Retangulo da área: "+retangulo.area());
	   //retangulo.status=3;
		System.out.println("Dados do Retangulo da diagonal: "+retangulo.diagonal());
		//retangulo.status=2;
		//System.out.println("Dados do Retangulo da Perimetro: "+retangulo.diagonal());
		
	}
      
}
