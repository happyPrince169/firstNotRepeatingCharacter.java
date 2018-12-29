package Codefights;

public class FirstNotRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));
	}

	static char firstNotRepeatingCharacter(String s) {
		char[] arr = s.toCharArray();
		int count = 0;
		char tmp = '_';
		if (arr.length < 2)
			return arr[0];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i != j) {
					if (arr[i] == arr[j]) {
						count++;
					}
					if (count > 0) {
						break;
					}
				}
			}
			if (count == 0) {
				tmp = arr[i];
				break;
			}
			count = 0;
		}
		// System.out.print(arr[i]);
		return tmp;
	}
}
