package logical;

public class Bang3 {
public static void main(String[] args) {
	String str="Akshay";
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='A') {
			System.out.print("@");
		}
		else {
			System.out.print(ch[i]);
		}
	}
	
}
}
