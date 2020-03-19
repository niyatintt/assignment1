import java.util.Scanner;

import assignment2.Array1;
import assignment2.Child_B;
import assignment2.Employee;
import assignment2.Invoice;
import assignment2.Manager;
import assignment2.Parent_A;
import assignment2.Rectangle;
import assignment2.Square;

public class Mainclass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		TaxCalculator taxcal = new TaxCalculator();
		Electronics electronic = new Electronics();

//		System.out.println("please enter the account number");
//		//int accountNumber = scanner.nextInt();
//		System.out.println("please enter the current balance ");
		//int balance1 = scanner.nextInt();
		//System.out.println("please enter the deposite amount");
		//int depositeAmt = scanner.nextInt();
		//bank.deposit(depositeAmt, balance1);
		//taxcal.calculateTax();

		//electronic.computeSalePrice();
//		Array1 array1=new Array1();
//		Parent_A objparent=new Parent_A();
//		Child_B objchild=new Child_B();
//		Manager m=new Manager();
//		Employee e=new Employee();
//		System.out.println("enter the lenghth");
//		int lenghth1=scanner.nextInt();
//		System.out.println("enter the breadth");
//		int lenghth2=scanner.nextInt();
//		
//		  Rectangle objrec=new Rectangle(lenghth1,lenghth2);
//		 Square objsq= new Square(lenghth1);
		 Invoice inv1=new Invoice();
		
		
				
		//calling array1 class method 
		//array1.isAllEven();
		//calling parent method by parent obj
	//	objparent.printMethod1();
		//calling child method child obj
	//	objchild.printMethod2();
	   // objchild.printMethod1();
		//m.methodformanger();
	//	e.methodforEmployee();
//		  objrec.peremeterofRectangle();
//		  objrec.areaofRectangle();
//		  objsq.areaofRectangle();
//		  objsq.peremeterofRectangle();
		 inv1.getInvoice();
	}

}
