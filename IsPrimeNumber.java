package assignment.jul20;

public class IsPrimeNumber {
public static void main(String[] args) {
	int n = 4;
	boolean isPrime = true;
	
	for (int i = 2; i < n; i++) {
		if (n % i == 0) {
			isPrime = false;
			break;
		}
	}
	
	if(isPrime) {
		System.out.println(n + " is Prime");
	} else {
		System.out.println(n + " is not Prime");
	}
}
}

