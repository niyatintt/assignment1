import java.util.Scanner;

public class Student {
	String studentName;
	int rollNo;
	double ec1Marks;
	double ec2Marks;
	double ec3Marks;

	Scanner scanner = new Scanner(System.in);

	public void averageMarks() {
		System.out.println("please enter student name ");
		studentName = scanner.nextLine();
		System.out.println("please enter three subject marks");
		ec1Marks = scanner.nextDouble();
		ec2Marks = scanner.nextDouble();
		ec3Marks = scanner.nextDouble();

		double averagemarks = (ec1Marks + ec2Marks + ec3Marks) / 3;

		System.out.println("the average marks is" + averagemarks);
		if (averagemarks >= 50) {
			System.out.println("the student " + studentName + "has pass the exam");
		} else {
			System.out.println("the student " + studentName + "has fail the exam");
		}
	}

}
