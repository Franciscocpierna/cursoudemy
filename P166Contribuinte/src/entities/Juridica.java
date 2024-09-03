package entities;

public class Juridica extends Pessoa {
	//String name;
	//double renda;
	int numfunc;
	

	

	
	public Juridica(String name, Double renda, int numfunc) {
		super(name, renda);
		this.numfunc = numfunc;
		
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
		 return this.getRenda()*14/100;
	 }	
		return this.getRenda()*16/100;
	}
	

}
