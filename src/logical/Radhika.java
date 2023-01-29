package logical;

public class Radhika {
	public static void main(String[] args) {
		String tr="ahankaar";
		char []ch=tr.toCharArray();
		for(int i=0;i<tr.length();i++){
			if(ch[i]=='a') {
				System.out.print("%");
			}
			else {
				System.out.print(ch[i]);
			}
		}
	}

}
