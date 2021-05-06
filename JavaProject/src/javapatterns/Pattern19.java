package javapatterns;

public class Pattern19 {

	public static void main(String[] args) {
		String res="";
		for(int row=1;row<=5;row++) {
			for(int col=0;col<row;col++) {
			res+= col+" "; 
			}
		res+="\n";
		}
		System.out.println(res);


	}

}
