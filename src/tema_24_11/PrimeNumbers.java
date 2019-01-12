package tema_24_11;

public class PrimeNumbers {
	public static void main (String [] args ) {
		int sum=1;
		int i=0;
		int n=0;
		
		while (i<100) {
			n=n++;
			if (n%2!=0) {
				if(is_Prime(n)) {
					sum=sum+n;
					i = i++;
				}
			}
		}
		System.out.println("Sum of the first 100 prime numbers"+sum );
		
	}

	public static boolean is_Prime(int n) {
	for (int i = 3; i * i <= n; i+= 2) {
		if (n % i == 0) {
			return false; 
		}
	}
	return true;
}
}
		