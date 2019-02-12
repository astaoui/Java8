package java8.defaultmethod;

public enum Operation {

	PLUS("+") {
		public double apply(double val1, double val2) {
			return val1 + val2;
		}
	},
	MINUS("-") {
		public double apply(double val1, double val2) {
			return val1 - val2;
		}
	},
	MULTIPLY("*") {
		public double apply(double val1, double val2) {
			return val1 * val2;
		}
	},
	DEVIDE("/") {
		public double apply(double val1, double val2) {
			return val1 / val2;
		}
	};

	private final String symbol;

	Operation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	public abstract double apply(double x, double y);

}
