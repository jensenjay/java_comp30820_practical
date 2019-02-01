package practical1;

import java.util.Scanner;

public class CalculatePopulation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an year:");
		int currentPeople = 312032486;
		int year = input.nextInt();
		int second = year*365*24*60*60;
		int birthOfPeople = (int)second/7;
		int deathOfPeople = (int)second/13;
		int immigrantOfPeople = (int)second/45;
		int predictionOfPeople = birthOfPeople+currentPeople+immigrantOfPeople-deathOfPeople;
		System.out.println("the predictive number of people is "+predictionOfPeople);
		
		

	}

}
