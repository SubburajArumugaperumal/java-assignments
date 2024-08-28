package assignment.sixthhdayW3D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsList {
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> L1 = new ArrayList<>();
		for (int i = 0; i < n.length; i++) {
			L1.add(n[i]);
		}	
		Collections.sort(L1);	

		for (int i = 0; i < L1.get(L1.size()-1); i++) {
			if (!L1.contains(i+1)) {
				System.out.println(i+1);
			}
		}
	}

}
