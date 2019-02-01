package practical1;

import java.util.Scanner;

public class CalculateAreaAndVolume {
	public static void main(String[] args) {
		// read radius
		Scanner input = new Scanner(System.in);
		System.out.println("please input the radius:");
		double raduis = input.nextDouble();
		
		// calculate the area
		double area = Math.PI * Math.pow(raduis, 2);
		System.out.println("the area of the circular is " + area);
		
		// read the length
		System.out.println("please input the length of the cylinder:");
		double length = input.nextDouble();
		
		// calculate the volume
		double volume = area * length;
		
		// display the result
		System.out.println("the volume of the circular is " + volume);
	}

}
