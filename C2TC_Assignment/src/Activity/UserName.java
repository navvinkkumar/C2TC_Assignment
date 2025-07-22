package Activity;
import java.util.Scanner;
public class UserName {
public static void main(String args[])
{
    Scanner input= new Scanner(System.in);
	System.out.println("Enter your name:");
	String n= input.next();
	System.out.println("Hello"+n);
}
}
