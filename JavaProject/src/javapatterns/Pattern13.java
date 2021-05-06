package javapatterns;
/**
**
***
****
******/
public class Pattern13 {

		public static void main(String[] args) {
			  String res="";
				for(int row=1;row<=5;row++) {
					for(int col=1;col<=row;col++) {
					res+= "*"; 
					}
				res+="\n";
				}
				System.out.println(res);

	}

}
