package logical;

public class Bang1 {

	public static void main(String[] args) {
		String str="I am Indian citizen";
		String [] ar=str.split(" ");
		for(int i=0;i<ar.length;i++) {
			char [] ch =ar[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}

	}

}
