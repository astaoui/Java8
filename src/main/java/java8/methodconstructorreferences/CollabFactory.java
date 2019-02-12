package java8.methodconstructorreferences;

import java.util.Set;

import java8.predicate.Collab;
import java8.predicate.SkillsEnum;

public interface CollabFactory <C extends Collab> {
	Collab create(String name, Integer age, Set<SkillsEnum> skills);
}
