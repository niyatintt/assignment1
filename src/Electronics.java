import java.util.Scanner;

public class Electronics {

	double regularPrice;
	private double manufacturer;
	double saleprice;
	Scanner scanner = new Scanner(System.in);

	public double computeSalePrice() {
		System.out.println("please enter the regular price");
		regularPrice = scanner.nextDouble();

		saleprice = regularPrice * 0.6;

		return saleprice;

	}

	public double getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(double manufacturer) {
		this.manufacturer = manufacturer;
	}

}
