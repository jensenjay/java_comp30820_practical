package practical1;

import java.util.Scanner;

public class CalculateWindchillTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number of temperature between -58F~41F: ");
		double temperature = input.nextDouble();
		System.out.println("Please input a number of wind speed which is >= 2 m/s: ");
		double windSpeed = input.nextDouble();
		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		System.out.println("the wind-chill temperature is :" + windChill);
	}

}
