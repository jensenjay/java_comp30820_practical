package practical1;
import java.util.Scanner;
public class CalculatePrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the distance(km): ");
		double distance = input.nextDouble();
		System.out.println("Please input the price of per gallon(Europe): ");
		double pricePerGallon = input.nextDouble();
		System.out.println("Please input the efficiency of the car in miles per gallon(km/gallon): ");
		double efficiency = input.nextDouble();
		double price = distance/efficiency*pricePerGallon;
		System.out.println("the price is :"+price);
		

	}

}
