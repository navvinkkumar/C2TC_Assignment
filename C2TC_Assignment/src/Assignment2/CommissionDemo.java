package Assignment2;
import java.util.*;
public class CommissionDemo {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	     System.out.print("Enter Employee Name: ");
	     String name = sc.nextLine();

	     System.out.print("Enter Employee ID: ");
	     int id = sc.nextInt();

	     System.out.print("Enter Sales Amount: ");
	     double sales = sc.nextDouble();

	     Commission emp = new Commission(name, id, sales);

	    
	     emp.display();

	     sc.close();

	}
}
