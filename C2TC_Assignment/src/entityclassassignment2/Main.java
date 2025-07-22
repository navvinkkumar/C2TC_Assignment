package entityclassassignment2;

public class Main {
	  public static void main(String[] args) {
	        Product p1 = new Product("Laptop", 101, 55000.00);
	        Product p2 = new Product("Phone", 102, 25000.00);
	        Product p3 = new Product("Mouse", 103, 500.00);
	        Product p4 = new Product("Keyboard", 104, 1500.00);

	        System.out.println("Product Details:");
	        p1.display();
	        p2.display();
	        p3.display();
	        p4.display();
}
	  }

