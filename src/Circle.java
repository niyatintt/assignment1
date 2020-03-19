import java.util.Scanner;

public class Circle {

	int radius;
	Scanner scanner = new Scanner(System.in);

	public void areaOfCircle() {
		System.out.println("please enter the raduis");
		radius = scanner.nextInt();

		double area = (2 * 3.14 * radius);
		System.out.println("the area of circle is" + area);
	}

	public void perimeter() {
		System.out.println("please enter the raduis");
		radius = scanner.nextInt();

		double peremeter = (2 * radius);
		System.out.println("the area of circle is" + peremeter);

	}

}
