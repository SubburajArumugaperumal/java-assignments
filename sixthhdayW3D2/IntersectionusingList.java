package assignment.sixthhdayW3D2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionusingList {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		
		 List<Integer> L1 = new ArrayList<>();
		 for (int num : arr1) {
		 L1.add(num);
		 }
		 
		 List<Integer> L2 = new ArrayList<>();
		 for (int num : arr2) {
		 L2.add(num);
		 }
		 List<Integer> intersection = new ArrayList<>();
		 for (Integer number : L1) {
			 if(L2.contains(number)) {
				 intersection.add(number);
			 }
		 }
		 
		 System.out.println("Intersection" + intersection);
	}
		 

}
