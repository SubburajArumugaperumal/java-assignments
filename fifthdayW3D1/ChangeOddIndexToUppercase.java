package assignment.fifthdayW3D1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String text="changeme";
		char[]name=text.toCharArray();
		
		for(int i=0; i<name.length; i++) {
			if (i%2==1) {
				
				name[i] = Character.toUpperCase(name[i]);
			}
		}
		System.out.println(String.valueOf(name));
	}
}
