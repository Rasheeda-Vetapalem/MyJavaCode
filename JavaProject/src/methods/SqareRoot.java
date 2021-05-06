package methods;

public class SqareRoot {
	static void squareRoot(int number) {
	String str="";
		for(int index=1;index<= number;index++) {
			if(index*index == number) {
				System.out.println(index);
				break;
				
			}
			else if(index > number){
				System.out.println("Sqare is not possible");
				break;
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		
		squareRoot(100);
		

	}

}
