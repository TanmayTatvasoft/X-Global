package logical;

public class T2 {

	public static void main(String[] args) {
	String s= "avinash";
	char[]kk=s.toCharArray();
	for(int i=0;i<kk.length;i++) {
		if(kk[i]=='a') {
			System.out.print("@");
		}
		else {
			System.out.print(kk[i]);
		}
	}

	}

}
