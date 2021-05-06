package javapatterns;

public class Pattern15 {

	public static void main(String[] args) {
		String res="";
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=5;col++) {
				if (col>=row) {
					res+="* ";
				}
				else{
					res+= " ";
				}
			
			
			}
			
		res+="\n";
		}
		System.out.println(res);

	}

}
