package logical;

public class Vdd {

	public static void main(String[] args) {
	String []ar = {"Gauri", "Yasmin","Rajni","Tanmay","Gauri","Tanmay"};
	for(int i=0;i<ar.length;i++){
		for(int j=i+1;j<ar.length;j++){
		//if(ar[i].charAt(0)=='Y'|| ar[i].charAt(ar[i].length()-1)=='y') {
			if(ar[i]==ar[j]) {
				
			System.out.println(ar[i]);
			}
			
		}
	}}}
