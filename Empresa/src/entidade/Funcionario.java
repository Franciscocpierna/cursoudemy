package entidade;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	public double salarioLiquido; 
	
	
	public double salarioLiquido() {
		return  salarioBruto-imposto;
		
	}
	
	public void salarioNovo(double porcentagem) {
		this.salarioBruto=this.salarioBruto*((100+porcentagem)/100)-imposto;
		
	}
	
	  public String toString() {
	    	 return "Porcentagem: "
	         + String.format("A porcentagem inclusa no Sálario é %.2f",porcentagem)
	         +"\nNome e Salário Novo : "
	         + nome + " , $  "+String.format("%.2f",salarioBruto);
	        
	    }

}
