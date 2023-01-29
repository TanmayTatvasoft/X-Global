package logical;

public class Bang2 {

	public static void main(String[] args) {
		String [] str= {"Tanmay","Anal","Hide","Grant","Yogesh"};
		for(int i=0;i<str.length;i++) {
			if(str[i].charAt(0)=='T'|| str[i].charAt((str[i].length()-1))=='h') {
			System.out.println(str[i]);	
			}
		}
	}

}
