package assignment.fifthdayW3D1;

public class ReverseOddWordsinaString {
	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] a = text.split(" ");
		for(int i=0; i<a.length; i++) {
			if(i%2==1) {
				String temp = a[i];
				char[] ab=temp.toCharArray();
				//System.out.print(" ");
				for(int j = ab.length-1; j>=0; j--) {
					System.out.print(ab[j]);
				}
				System.out.print(" ");
			}else {
				System.out.print(a[i]+" ");
			}
			
		}
	}
	
}
