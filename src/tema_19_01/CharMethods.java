package tema_19_01;

public class CharMethods extends IndexForChar {

	public static void returnIndex() {
		int i = -1; 
		while(i< (string1+string2+string3).indexOf("i")) {
			System.out.println((string1+string2+string3).indexOf("i"));
		}

	}

	public boolean isPalindrome() {


		String check = string4.replaceAll(" ", "").toLowerCase();
		int len = check.length();
		for (int i = 0; i < len / 2; ++i) {
			if (check.charAt(i) != check.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}

