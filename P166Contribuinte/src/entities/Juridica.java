package entities;

public class Juridica extends Pessoa {
	//String name;
	//double renda;
	int numfunc;
	String cnpj;

	

	
	public Juridica(String name, Double renda, int numfunc, String cnpj) {
		super(name, renda);
		this.numfunc = numfunc;
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
	public int getNumfunc() {
		return numfunc;
	}
	public void setNumfunc(int numfunc) {
		this.numfunc=numfunc;
	}

	@Override
	public double calcimposto() {
	 if (this.getNumfunc() > 10){
		 return this.getRenda()-(this.getRenda()*14/100);
	 }	
		return this.getRenda()-(this.getRenda()*16/100);
	}
	

}
