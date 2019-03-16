package tema_08_12;

public class TresCinco {

	public static void main(String args[]) {
		System.out.println("Tres ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)

				System.out.print(i + ", ");
		}

		System.out.println("Cinco ");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0)

				System.out.print(i + ", ");
		}

		System.out.println("TresCinco ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)

				System.out.print(i + ", ");
		}
		System.out.println("\n");
	}
}
