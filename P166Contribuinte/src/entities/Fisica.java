package entities;

public class Fisica extends Pessoa{
	//String name; vem de Pessoa
	//double renda; vem de Pessoa
    double gastosaude;
	String cpf;
	
	
	public Fisica(String name, Double renda, String cpf, double gastosaude) {
		super(name, renda);
		this.gastosaude=0;
		this.cpf = cpf;
	}
    

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
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
			if(this.gastosaude>0) {
				return (this.getRenda()-(this.getRenda()*15/100)) - (this.getGastosaude()-(this.getGastosaude()*50/100));
			}else {
				return (this.getRenda()-(this.getRenda()*15/100));	
			}	
		}else {
			if(this.gastosaude>0) {
				return (this.getRenda()-(this.getRenda()*25/100)) - (this.getGastosaude()-(this.getGastosaude()*50/100));
			}else {
				return (this.getRenda()-(this.getRenda()*25/100)); 
			}
				
		}
			 
		
		
		
	};

}
