package trabstring;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String original = "abcde FGHIJ ABC abc DEFG";
        String s01 = original.toLowerCase(); 
       // System.out.println(s01); 
        String s02 = original.toUpperCase();
        //System.out.println(s02);
        String s03 = original.trim();
       // System.out.println(s03);// eliminaespaços nos extremos
        String s04 = original.substring(2); //pega a partir da posição 3 até o fim da string 
       // System.out.println(s04);
        String s05 = original.substring(2,9);
        //System.out.println(s05);
        String s07 = original.replace("abc", "xy");
        //System.out.println(s07);
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println(i);
        System.out.println(j);
        String s ="potato aple leson";
        		
        String[] s08 = s.split(" ");
        System.out.println(s08[0]);
        System.out.println(s08[1]);
        System.out.println(s08[2]);
        s08= original.split(" ");
        System.out.println(s08[0]);
        System.out.println(s08[1]);
        System.out.println(s08[4]);
	}

}
