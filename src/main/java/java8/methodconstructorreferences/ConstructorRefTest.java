package java8.methodconstructorreferences;

import java.util.HashSet;

import java8.predicate.Collab;

public class ConstructorRefTest {

	public static void main(String[] args) {
		
		CollabFactory<Collab> factory= Collab::new;
		Collab asta = factory.create("asta", 25, new HashSet<>());
		System.out.println(asta);
		
	}
}
