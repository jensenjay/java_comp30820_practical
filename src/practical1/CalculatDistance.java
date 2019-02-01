package practical1;

import java.util.Scanner;

public class CalculatDistance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the first point(x1,y1):");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Please input the second point(x2,y2):");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double temp = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);
		double distance = Math.sqrt(temp);
		System.out.println("The distance between "+"("+x1+","+y1+")and("+x2+","+y2+") is:"+distance);
		

	}

}
