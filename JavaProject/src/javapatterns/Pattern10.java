package javapatterns;

public class Pattern10 {
	public static void main(String[] args) {
	  String res="";
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
			res+= row+""; 
			}
		res+="\n";
		}
		System.out.println(res);
	}
}
