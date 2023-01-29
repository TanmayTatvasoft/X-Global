package logical;

public class Tan123 {

	public static void main(String[] args) {
	   String [] m= {"Tennis","Cricket","Jadu"};
	   String [] n=new String[3];
	   int d=0;
	   for(int i='A';i<='Z';i++) {
		   for(int j=0;j<m.length;j++) {
			   if(i==m[j].charAt(0)) {
				   n[d]=m[j];
				   d++;
			   }
		   }
	   }
	   for(int x=0;x<n.length;x++) {
		   System.out.println(n[x]);
	   }
	}

}
