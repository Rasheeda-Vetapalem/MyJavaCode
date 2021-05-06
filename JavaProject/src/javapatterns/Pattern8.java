package javapatterns;
/*1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9*/
public class Pattern8 {

	public static void main(String[] args) {
		String res="";
		
	    for(int row=1;row<=5;row++) {
	    	int num=row;
		for(int col=1;col<=row;col++) {
		res+= num++ + " " ;
		
		}
	  res+="\n";
	    }
	System.out.println(res);

	}

}
