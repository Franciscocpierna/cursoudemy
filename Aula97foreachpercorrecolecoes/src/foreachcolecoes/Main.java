package foreachcolecoes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		//poderia fazer assim
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}

		for (String apelido : vect) {
			System.out.println(apelido);
		}

	}

}
