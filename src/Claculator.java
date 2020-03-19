import java.util.Scanner;

public class Claculator {

	Scanner scanner = new Scanner(System.in);

	public void add() {
		System.out.println("please enter three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int sum = num1 + num2 + num3;
		System.out.println("the sum of three number is" + sum);

	}

	public void muliply() {
		System.out.println("please enter three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int sum = num1 * num2 * num3;
		System.out.println("the multiply of three number is" + sum);

	}

	public void divide() {
		System.out.println("please enter two numbers to divide");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int sum = num1 / num2;
		System.out.println("the sum of three number is" + sum);

	}

	public void substarct() {
		System.out.println("please enter three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int sum = num1 - num2;
		System.out.println("the sum of three number is" + sum);

	}

}
