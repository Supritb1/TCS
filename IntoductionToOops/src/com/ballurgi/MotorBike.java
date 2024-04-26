package com.ballurgi;

public class MotorBike {

	private int speed;

	public MotorBike(int speed) {
		this.speed = speed;
		System.out.println(this.speed);
	}

	public MotorBike() {
		this(10);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
		System.out.println(this.speed);

	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);

	}

	public void decreaseeSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);

	}

}
