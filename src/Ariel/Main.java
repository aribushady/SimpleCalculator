package Ariel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		menu();
    }

    public static void menu() {
		Scanner scanner = new Scanner(System.in);
		SimpleCalc calc = new SimpleCalc();
		int choice;

		do {
			System.out.println("Pick from one of the below options");

			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("0: Quit");

			choice = scanner.nextInt();

			switch (choice) {

				case 1:
					getInput(calc);
					System.out.println(calc.getSumValue());
					break;
				case 2:
					getInput(calc);
					System.out.println(calc.getDifferenceValue());
					break;
				case 3:
					getInput(calc);
					System.out.println(calc.getProductValue());
					break;
				case 4:
					getInput(calc);
					System.out.println(calc.getQuotientValue());
					break;
				case 0:
					System.out.println("Exited");
					break;
				default:
					System.out.println("Not a valid menu option");
					break;
			}

		} while(choice != 0);
	}
//ToDo
	// Add input validation
	public static SimpleCalc getInput(SimpleCalc calc) {
		Scanner scanner = new Scanner(System.in);
		double inputOne, inputTwo;

		System.out.println("Enter the first number");
		inputOne = scanner.nextDouble();
		calc.setFirstNum(inputOne);

		System.out.println("Enter the second number");
		inputTwo = scanner.nextDouble();
		calc.setSecondNum(inputTwo);

    	return calc;
	}
}
