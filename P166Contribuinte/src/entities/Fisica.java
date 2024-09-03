package entities;

public class Fisica extends Pessoa{
	//String name; vem de Pessoa
	//double renda; vem de Pessoa
    double gastosaude;
	
	
	
	public Fisica(String name, Double renda, double gastosaude) {
		super(name, renda);
		this.gastosaude=gastosaude;
		
	}
    


	public double getGastosaude() {
		return gastosaude;
	}


	public void setGastosaude(double gastosaude) {
		this.gastosaude = gastosaude;
	}

	@Override
	public  double calcimposto() {
		
		if (this.getRenda() < 20000.00){
			if(this.getGastosaude()>0) {
				return (this.getRenda()*15/100) - (this.getGastosaude()*50/100);
			}else {
				return this.getRenda()*15/100;	
			}	
		}else {
			if(this.getGastosaude()>0) {
				return (this.getRenda()*25/100) - (this.getGastosaude()*50/100);
			}else {
				return this.getRenda()*25/100; 
			}
				
		}
			 
		
		
		
	};

}
