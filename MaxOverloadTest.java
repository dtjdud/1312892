import java.util.Scanner;

class Max {
	int test(int a, int b) {
		return (a > b ? a : b); 
	}
	double test(double a, double b) {
		return (a > b ? a : b);
	}
}
public class MaxOverloadTest {
	public static void main (String[] args) {
		Max maxNumber = new Max();
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the 2 integer number : ");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		System.out.println("The bigger number(integer) is " + maxNumber.test(i1, i2));
		
		System.out.print("Enter the 2 real number : ");
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		System.out.println("The bigger number(double) is " + maxNumber.test(d1, d2));
	}
}
