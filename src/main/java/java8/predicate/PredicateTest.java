package java8.predicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> lesChiens = Arrays.asList("Ouss", "Moud", "Ouum", "Souf");

		if (lesChiens.stream().anyMatch(s -> s.startsWith("Y"))) {
			System.out.println("Sven was here");
		} else {
			System.out.println("Sven was never here");
		}

		//
		// Test 2
		//

		List<Collab> collabs = Arrays.asList(
				new Collab("Ouss", 26, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.TMJ, SkillsEnum.WS))),
				new Collab("Moud", 25, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.TMJ, SkillsEnum.MOM))),
				new Collab("Ouum", 24, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.TMJ, SkillsEnum.COBOL))),
				new Collab("Souf", 27, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.WS, SkillsEnum.MOM))));

		if (collabs.stream().anyMatch((s) -> s.getName().startsWith("S"))) {
			System.out.println("Sven was here");
		} else {
			System.out.println("Sven was never here");
		}
	}

}
