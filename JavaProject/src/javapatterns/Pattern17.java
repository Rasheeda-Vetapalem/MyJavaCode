package javapatterns;

public class Pattern17 {

	public static void main(String[] args) {
		String res="";
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==1||row==5||col==5) {
			res+= "*  "; 
				}
				else
				res+="   ";
			}
		res+="\n";
		}
		System.out.println(res);

	}

}
