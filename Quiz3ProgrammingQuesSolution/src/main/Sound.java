package main;

public class Sound {
	public double calculate(double timeInterval) {
		int soundVelocity = 1100;
		
		double distance = timeInterval * soundVelocity;
		return distance;
	}
}
