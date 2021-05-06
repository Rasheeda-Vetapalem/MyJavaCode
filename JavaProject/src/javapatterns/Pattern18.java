package javapatterns;

public class Pattern18 {
	public static void main(String[] args){
	String res="";
	int temp=2;
	for(int row=1;row<=5;row++) {
		for(int col=1;col<=5;col++) {
			if(row>=col) {
		       res+=  temp; 
		       temp += 2;
			}
			res+=" ";
		}
	res+="\n";
	}
	System.out.println(res);
}
}