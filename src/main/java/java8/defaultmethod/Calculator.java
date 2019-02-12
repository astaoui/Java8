package java8.defaultmethod;

public interface Calculator {

	default double add(double val1, double val2) {
		return Operation.PLUS.apply(val1, val2);
	}

	default double multiply(double val1, double val2){
		return Operation.MULTIPLY.apply(val1, val2);
	}

	default double substract(double val1, double val2){
		return Operation.MINUS.apply(val1, val2);
	}

	default double devide(double val1, double val2){
		return Operation.DEVIDE.apply(val1, val2);
	}

}
