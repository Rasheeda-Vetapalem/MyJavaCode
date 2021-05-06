package mayuri;

public class Smallest {

	public static void main(String[] args) {
		String res="";
		for(int row=1;row<=4; row++) {
			for(int col=1; col<=4; col++) {
				if(col==1||col==3) {
					res+="0";
				}
				else {
					res+="1";
				}
			}
			res+="\n";
		}
		System.out.println(res);

	}

}
