package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class DisplayDessending {
		public static void main(String args[]){
		   ArrayList<String> arraylist = new ArrayList<String>();
		   arraylist.add("Rasheeda");
		   arraylist.add("vani");
		   arraylist.add("shyam");
		   arraylist.add("meghana");
		   Collections.sort(arraylist, Collections.reverseOrder());

		   System.out.println("ArrayList in descending order:");
		   for(String str: arraylist){
				System.out.println(str);
			}
		}
}
