package assignment.secondday;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int a[] = {1,4,3,2,8, 6, 7};
		int b=-1;
		Arrays.sort(a);
		for (int i = 0; i < 7; i++) {
			if(a[i]!=(i+1)) {
				b=i+1;
				System.out.println(b);
				break;
			}
		}
		
		
	}
}
