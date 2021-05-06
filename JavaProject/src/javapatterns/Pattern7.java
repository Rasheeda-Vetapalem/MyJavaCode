package javapatterns;
/*5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 */
public class Pattern7 {
		public static void main(String[] args) {
			String res="";
	    for(int row=5;row>=1;row--) {
		for(int col=5;col>=row;col--) {
		res+= row+" ";
		}
	  res+="\n";
	    }
	System.out.println(res);

	}

}
