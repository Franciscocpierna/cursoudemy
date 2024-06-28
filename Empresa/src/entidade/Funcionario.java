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
		this.salarioBruto=salarioBruto*((100+porcentagem)/100);
		
	}
	
	  public String toString() {
	    	 return nome
	         + ", Salario Liquido $ "
	         +String.format("%.2f",salarioLiquido)
	         +" Salário Novo : $ "
	         +String.format("%.2f",salarioBruto);
	        
	    }

}
