package java8.function;

import java.util.function.Function;

import java8.defaultmethod.Operation;

public class FunctionTest {
	
	public static void main(String[] args) {
		
		Function<Double,Double> sum = (Double a)-> Operation.PLUS.apply(a.doubleValue(), a.doubleValue());
		Function<Double,Double> thenMulti = (Double a)-> Operation.MULTIPLY.apply(a.doubleValue(), a.doubleValue());
		
		System.out.println(sum.andThen(thenMulti).apply(2.0));
		
	}

}
