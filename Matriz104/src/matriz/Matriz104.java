package matriz;

import java.util.Scanner;

public class Matriz104 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m,k;
		System.out.print("entre com mumero de linhas:");
		m=sc.nextInt();
		System.out.print("entre com mumero de colunas:");
		n=sc.nextInt();
		int [][] matr= new int [m][n]; 
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				matr[i][j]= sc.nextInt();
				
			}
		}
		
		System.out.print("entre com número da matriz a pesquisar:");
		k = sc.nextInt();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if (matr[i][j]==k) {
					System.out.print("posição "+i+","+j);
					System.out.println();
					if (i!=0) {
						if(j>0) {
						 System.out.println("Left "+matr[i][(j-1)]);
						}
						System.out.println("UP "+matr[i-1][j]);
						
						if(j<(n-1)) {
							 System.out.println("Right "+matr[i][j+1]);
							}
						if(i<(m-1)) {
							 System.out.println("Down "+matr[i+1][j]);
							}
					}else{
						if(j>0) {
							System.out.println("Left "+matr[i][(j-1)]);
							}
				     	if(j<(n-1)) {
				     		System.out.println("Right "+matr[i][j+1]);
								}
						if(i<(m-1)) {
							System.out.println("Down "+matr[i+1][j]);
								}
					}
				}
			}
		}
		
        sc.close();
        
	}

}
