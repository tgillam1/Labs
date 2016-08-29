import java.util.Random;
import java.util.Scanner;

public class LabNumber5<RandomGenerator> {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 

		String userInput = "numberOfSides";

		System.out.println("Welcome to the Grand Circus Casino.");
		System.out.println();

		System.out.println("How many sides should each die have?");
		int sides = scanner.nextInt(); 
	

		System.out.println("Do you think the odds are in your favor? (y/n)");
		String yesOrNo = scanner.next();
		
		if (yesOrNo.equals("y")) {
			System.out.println("Wonderful!");
			
			System.out.println("Roll again? (y/n)");
			yesOrNo = scanner.next();
		if (yesOrNo.equalsIgnoreCase("y")) {
		   System.out.println("Roll on, then!");
		} else {
			System.out.println("Snake eyes."); 
} else {
		System.out.println("Thanks for rolling with us");
	}

		}
		}
	public static void 
	}		
	
		
	
			
