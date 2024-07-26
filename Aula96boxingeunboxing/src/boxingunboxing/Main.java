package boxingunboxing;

public class Main {

	public static void main(String[] args) {
		int x = 20; // aloca uma caixa na menoria stack uma caixa com 20
		//Object obj = x; //objeto aponta para uma referencia a 20 na na memopria Heap
		Integer obj = x; // Integer é objeto já compativel pai do int não precisa do cast
		//Integer é wapeper classes
		System.out.println(obj); 
        //int y = (int )obj; nesse caso usando Object preciso usar cast (int) para compatibilizar com tipo int
		int y=obj*2;
        System.out.println(y);
	}

}
