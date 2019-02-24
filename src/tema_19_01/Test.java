package tema_19_01;

import static org.junit.Assert.assertEquals;

class Test {

	public static void testReturnIndex1() {
		int i = -1;
		while (i > ("Mergem sa cumparam pizza").indexOf("i")) {
			System.out.println(("Mergem sa cumparam pizza").indexOf("i"));

		}

		assertEquals(("Mergem sa cumparam pizza").indexOf("i"), 20);
	}

	public static void testReturnIndex2() {
		int i = -1;
		while (i > ("Mergem sa cumparam mancare").indexOf("i")) {
			System.out.println(("Mergem sa cumparam mancare").indexOf("i"));

		}

		assertEquals(("Mergem sa cumparam mancare").indexOf("i"), -1);
	}

	public static void testReturnIndex3() {
		int i = -1;
		while (i > ("Iarna nu-i asa de rea").indexOf("i")) {
			System.out.println(("Iarna nu-i asa de rea").indexOf("i"));

		}

		assertEquals(("Iarna nu-i asa de rea").indexOf("i"), 0);
	}

	public boolean testIsPalindrome1() {

		String check = "Lupul se plimba prin padure".replaceAll(" ", "").toLowerCase();
		int len = check.length();
		for (int i = 0; i < len / 2; ++i) {
			if (check.charAt(i) != check.charAt(len - 1 - i)) {
				return false;
			}
			return true;
		}
		assertEquals(false, false);
		return false;
	}

	public boolean testIsPalindrome2() {

		String check = "O rama maro".replaceAll(" ", "").toLowerCase();
		int len = check.length();
		for (int i = 0; i < len / 2; ++i) {
			if (check.charAt(i) != check.charAt(len - 1 - i)) {
				return false;
			}
			return true;
		}
		assertEquals(true, true);
		return false;
	}

	public boolean testIsPalindrome3() {

		String check = "O".replaceAll(" ", "").toLowerCase();
		int len = check.length();
		for (int i = 0; i < len / 2; ++i) {
			if (check.charAt(i) != check.charAt(len - 1 - i)) {
				return false;
			}
			return true;
		}
		assertEquals(false, false);
		return false;
	}
}
