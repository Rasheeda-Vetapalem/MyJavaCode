package mayuri;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int marks[]  = new int[5];
       
       for(int i = 0; i <marks.length; i++) {
    	    
    	          marks[i]    = Integer.parseInt(args[i]);
       }
       int sum = 0;
       
       for(int i = 0; i <marks.length; i++) {
    	   System.out.println(marks[i]);
    	   
    	   sum = sum + marks[i];
       }
       System.out.println("Sum is :  " + sum);
	}

}

