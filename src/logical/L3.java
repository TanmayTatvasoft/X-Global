package logical;

public class L3 {

	public static void main(String[] args) {
		   String name="Akshay Patil";
		      
           String[] arr=name.split(" ");
           for(int i=0;i<arr.length;i++) {
        	  char[]kk= arr[i].toCharArray();
        	  for(int j=kk.length-1;j>=0;j--) {
        		  System.out.print(kk[j]);
        	  }
        	  System.out.print(" ");
           }

	}

	}

