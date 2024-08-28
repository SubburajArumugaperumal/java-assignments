package assignment.sixthhdayW3D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		int [] a={3, 2, 11, 4, 6, 7};
		
				List<Integer> numbers=new ArrayList	<Integer>();
				for(int number : a) {
				numbers.add(number);
				}
				Collections.sort(numbers);
				
				int seclargestnumber = numbers.get(numbers.size()-2);
				System.out.println("secondlargestnumber is = "+seclargestnumber);
				
		
		
	}

}
