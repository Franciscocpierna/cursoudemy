package entidade;

public class Produto {
	public String nomeprod;
	public double precoprod;
	public int quantidade;
	public int number;
	
	public double totalValueInStock() {
		return precoprod*quantidade;
	}
    public void addProducts(int quantidade) {
    	this.quantidade += quantidade; //o primeiro quantidade é do objeto produto e o segundo o parametro do metodo
    	
    }
    
    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade; // igual cmentario acima	
    }
    
    public void addproduto(int number) {
    	this.quantidade += number;
    }
    
    public String toString() {
    	 return nomeprod
         + ", $ "
         +String.format("%.2f",precoprod)
         +", "
         +quantidade
         +" units, total: $ "
         + String.format("%.2f",totalValueInStock());
    }
}
