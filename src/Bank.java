import java.util.Scanner;

public class Bank {

	String accountNo;
	int balance;

	Scanner scanner = new Scanner(System.in);

	public int deposit(int depositeAmt, int balance1) {
		System.out.println("please enter the account number");
		// depositeAmt=scanner.nextInt();
		int newBalance = ((depositeAmt) + (balance1));
		System.out.println("the new balace is" + newBalance);

		return newBalance;

	}

	public int withdraw(int withdrawAmt) {
		System.out.println("please enter the account number");

		int newBalance = (balance - withdrawAmt);
		System.out.println("the new balace is" + newBalance);
		if (withdrawAmt > balance) {
			System.out.println("cannot withraw the money");
			return -1;
		} else {
			System.out.println("can withdraw the money");
			return 0;
		}

	}
}
