package logical;

public class L1 {

	public static void main(String[] args) {
		String[] zz=new String[4];
		String[] kk= {"Football","Hollyball","Cricket","Tennis"};
		int c=0;
		for(int i=0;i<kk.length;i++){
		for(int j = 'A';j<='Z';j++ ){
		if(j==kk[i].charAt(0))
		{  
		zz[c]= kk[i];
		c ++;
		}

		}

		}

		for(int x=0;x<zz.length;x++){
		System.out.println(zz[x]);
		}
	}

}
