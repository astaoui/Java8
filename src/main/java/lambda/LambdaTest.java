package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import java8.predicate.Collab;
import java8.predicate.SkillsEnum;

public class LambdaTest {

	public static void main(String[] args) {
		List<Collab> collabs = Arrays.asList(
				new Collab("Ouss", 26, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.TMJ, SkillsEnum.WS))),
				new Collab("Moud", 25, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.TMJ, SkillsEnum.MOM))),
				new Collab("Ouum", 24, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.TMJ, SkillsEnum.COBOL))),
				new Collab("Souf", 27, new HashSet<SkillsEnum>(Arrays.asList(SkillsEnum.WS, SkillsEnum.MOM))));

		Collections.sort(collabs, (a, b) -> a.getName().compareTo(b.getName()) + a.getName().compareTo(b.getName()));

		System.out.println(collabs);
		collabs.forEach(s -> System.out.println(s.getAge() + " " + s.getName()));

		Collections.sort(collabs, (a, b) -> a.getAge().compareTo(b.getAge()));

		System.out.println(collabs);

		Collections.sort(collabs, (a, b) -> a.getName().compareTo(b.getName()));

		System.out.println(collabs);

	}

}
