package assignment.sixthhdayW3D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] a={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> L1 = new ArrayList<>();
		Collections.addAll(L1, a);
		Collections.sort(L1);
		System.out.println(L1);
		
		for(int i=L1.size()-1; i>=0; i--) {
			System.out.println(L1.get(i));
		}
	}
	
}
