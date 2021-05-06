package javapatterns;
/*11111
22222
33333
44444*/
public class Pattern5 {
	public static void main(String[] args) {
		String res="";
    for(int row=1;row<=5;row++) {
	for(int col=1;col<=5;col++) {
	res+= row+" ";
	}
  res+="\n";
    }
System.out.println(res);
}
}
