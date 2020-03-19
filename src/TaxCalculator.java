import java.util.Scanner;

public class TaxCalculator {

	double annualIncome;
	double investedAmount;
	double taxableAmount;
	int pannumber;
	double tax;
	Scanner scanner = new Scanner(System.in);

	public void calculateTax() {

		System.out.println("enter the pannnumber");
		pannumber = scanner.nextInt();
		System.out.println("enter annual income");
		annualIncome = scanner.nextDouble();
		System.out.println("enter investedAmount");
		investedAmount = scanner.nextDouble();

		taxableAmount = annualIncome - investedAmount;
		System.out.println("the total amount is for investement is " + investedAmount);

		if ((taxableAmount >= 0) && (taxableAmount <= 2000)) {
			tax = 0;
		} else if ((taxableAmount >= 2001) && (taxableAmount <= 5000)) {
			tax = 0.02;
		} else if ((taxableAmount >= 5001) && (taxableAmount <= 10000)) {
			tax = 60 + 0.04;
		} else if ((taxableAmount >= 100001) && (taxableAmount <= 15000)) {
			tax = 260 + 0.06;
		} else if ((taxableAmount >= 150001) && (taxableAmount <= 20000)) {
			tax = 560 + 0.08;
		} else if ((taxableAmount >= 200001) && (taxableAmount <= 30000)) {
			tax = 960 + 0.10;
		} else if ((taxableAmount >= 300001) && (taxableAmount <= 50000)) {
			tax = 1960 + 1.25;
		} else if ((taxableAmount >= 500001)) {
			tax = 4460 + 1.5;
		}
		System.out.println("the amount of tax is" + tax);
	}
}