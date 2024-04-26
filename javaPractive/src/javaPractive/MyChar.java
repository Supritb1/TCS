package javaPractive;

public class MyChar {

	private char c;

	public MyChar(char c) {
		this.c = c;
	}

	public boolean isVowel() {

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

}
