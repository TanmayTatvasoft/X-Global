package logical;

public class Asce {
	public static void main(String[] args) {
		String[]kk= {"Aricket","Tollyball","Kennis"};
		String[]zz =new String[3];
		int c= 0;
		for(int j='A';j<='Z';j++) {
		for(int i=0;i<kk.length;i++) {
			
				if(j==kk[i].charAt(0)) {
					zz[c]=kk[i];
					c++;
					
					
				}
			}
			
		}
		for(int x=0;x<zz.length;x++) {
			System.out.println(zz[x]);
		}
		
	}
	
	

}





