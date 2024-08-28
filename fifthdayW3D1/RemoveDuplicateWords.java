package assignment.fifthdayW3D1;

import java.util.Iterator;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] a = text.split(" ");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
   				if (a[i].equalsIgnoreCase(a[j])) {
					//count++;
					count = count +1;
				}

			}
			if (count == 0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
