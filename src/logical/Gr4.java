package logical;

public class Gr4 {

	public static void main(String[] args) {
		String[] str= {"Rohan","Tanmay","Blackhat"};
		for(int i=0;i<str.length;i++) {	
			
			if(str[i].charAt(0)=='R' || str[i].charAt((str[i].length()-1))=='y') {
				System.out.println(str[i]);
				
		}

	}

}

}