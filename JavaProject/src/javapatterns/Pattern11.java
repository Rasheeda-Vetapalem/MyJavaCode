package javapatterns;
/*A
BC
DEF
GHIJ
KLMNO*/
public class Pattern11 {

	public static void main(String[] args) {
	String result = "";
	char a=65;
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=row;col++){
		result+= a+""; 
		a++;
	}
	result+= "\n";
	}
	System.out.println(result);
}
}
