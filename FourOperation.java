
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
		
		System.out.println("add 수행결과 : " + A.add(num1, num2));
		System.out.println("subtraction 수행결과 : " + A.subtraction(num1, num2));
		System.out.println("multi 수행결과 : " + A.multi(num1, num2));
		System.out.println("divide 수행결과 : " + A.divide(num1, num2));
	}
}
