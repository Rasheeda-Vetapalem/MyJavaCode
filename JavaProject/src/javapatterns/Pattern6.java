package javapatterns;
/*5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 */

public class Pattern6 {
	public static void main(String[] args) {
		String res="";
    for(int row=5;row>=1;row--) {
	for(int col=5;col>=1;col--) {
		res+= row+" ";
	}
			res+="\n";
    }
    System.out.println(res);
}
}
