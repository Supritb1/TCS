package javaPractive;

public class Dimention {

	private int feet;
	private int inches;

	public Dimention(int inches) {

		if (inches < 0) {
			feet = -1;
			inches = -1;
		} else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}
	}

	public int getFeet() {
		return feet;
	}

	public int getInches() {
		return inches;
	}

}
