package javaPractive;

public class KeyboardShortcuts {

	public int convertHoursToMunites(int Houus) {

		if (Houus < -1) {
			return -1;
		} else {
			return Houus * 60;

		}

	}

	public boolean validTriangle(int angle1, int angle2, int angle3) {

		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}
		int sumOfAngles = angle1 + angle2 + angle3;

		return sumOfAngles == 180;

	}

	public boolean isRightTriangle(int side1, int side2, int side3) {

		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}

		if (side1 * side1 + side2 * side2 == side3 * side3) {
			return true;
		}

		if (side2 * side2 + side3 * side3 == side1 * side1) {
			return true;
		}

		if (side3 * side3 + side1 * side1 == side2 * side2) {
			return true;
		}

		return false;

	}

	public long sumOfSquares(int n) {
		long sum = 0;

		if (n <= 0) {
			System.out.println("number is invalid");
		}

		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}

		return sum;
	}

	public String leapYear(int year) {

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			return year + " is leap year";
		}

		return year + " is not a leap year";

	}

	public boolean perfectNumber(int number) {

		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number > 1 && number % number == 0) {
				if (number % i == 0) {
					sum += i;
				}
			}
		}

		return sum == number;

	}

}
