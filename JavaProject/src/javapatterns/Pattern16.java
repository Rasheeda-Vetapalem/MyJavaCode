package javapatterns;

public class Pattern16 {

	public static void main(String[] args) {
		String res="";
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row>=col) {
			res+= " *"; 
				}
				res+=" ";
			}
		res+="\n";
		}
		System.out.println(res);

	}

}
