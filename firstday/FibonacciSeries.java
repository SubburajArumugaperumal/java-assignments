package assignment.firstday;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a + "\n" + b);
		for (int i = 3; i <= 8; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
