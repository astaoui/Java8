package java8.defaultmethod;

public class DefaultMethodeTest {

	public static void main(String[] args) {
		double val1 = 1, val2 = 2.0;
		Calculator calculator = new Calculator() {
		};
		System.out.println(calculator.add(val1, val2));
		System.out.println(calculator.substract(val1, val2));
		System.out.println(calculator.multiply(val1, val2));
		System.out.println(calculator.devide(val1, val2));
	}

}
