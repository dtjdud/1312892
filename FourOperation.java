
class AddMinus {
	int add(int x, int y) {return x + y;}
	int subtraction(int x, int y) {return x - y;}
}

class MultiDivide extends AddMinus {
	int multi(int x, int y) {return x * y;}
	int divide(int x, int y) {return x / y;}
}

public class FourOperation {
	public static void main(String args[]) {
		MultiDivide A = new MultiDivide();
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("add ������ : " + A.add(num1, num2));
		System.out.println("subtraction ������ : " + A.subtraction(num1, num2));
		System.out.println("multi ������ : " + A.multi(num1, num2));
		System.out.println("divide ������ : " + A.divide(num1, num2));
	}
}
