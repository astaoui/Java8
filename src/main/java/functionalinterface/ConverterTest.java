package functionalinterface;

import java.text.DateFormatSymbols;

public class ConverterTest {

	public static void main(String[] args) {


		Converter<Double, Double> fuhrerreich2Celsius = (from) -> from + 275;
		System.out.println(fuhrerreich2Celsius.convert(1.0));
		
		Converter<Integer, String> moisNumToName=(from)-> new DateFormatSymbols().getMonths()[from-1];
		System.out.println(moisNumToName.convert(5));
		
		Converter<String, Integer> converter = Integer::valueOf; // reference a static method
		Integer converted = converter.convert("123");
		System.out.println(converted);
		
	}

}


