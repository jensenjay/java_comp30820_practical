package practical1;
import java.util.Scanner;
public class CalculateDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number between 0 and 999: ");
		int number = input.nextInt();
		int reminder1 = number%10;
		int reminder2 = (number-reminder1)/10%10;
		int reminder3 = (number-reminder2*10-reminder1)/100;
		int total = reminder1+reminder2+reminder3;
		System.out.println("the count of each number is :"+total);
	}

}
