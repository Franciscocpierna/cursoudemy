package dados;

public class DadosAcesso {
  private int conta;
  private String name;
  private double saldoAtual;

  
  public DadosAcesso() {
		
	}
  public DadosAcesso(int conta, String name, double inicialDeposito) {
	this.conta = conta;
	this.name = name;
	//this.saldoAtual = saldoAtual;
	addDeposito(inicialDeposito);
 }
  public DadosAcesso(int conta, String name) {
		this.conta = conta;
		this.name = name;
		 
		
  }		
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {	
		this.conta = conta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	
	public void addDeposito(double adicionar) {
		this.saldoAtual += adicionar;
	}

	public void SaqueConta (double retirar) {
		this.saldoAtual = this.saldoAtual-retirar-5;
	}
	
	@Override
	public String toString() {
		return "DadosAcesso conta:  " 
	                         + conta 
	                         + " , nome " 
	                         + name 
	                         + ", saldoAtual $ " 
	                         + String.format("%.2f",saldoAtual);
	}
	  
	  
	
}
