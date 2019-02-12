package java8.predicate;

import java.util.Collections;
import java.util.Set;

public class Collab {

	private String Name;
	private Integer Age;
	private Set<SkillsEnum> skills;
	private Set<SkillsEnum> defaultSkills = Collections.emptySet();
	
	public Collab(String name, Integer age, Set<SkillsEnum> skills) {
		super();
		Name = name;
		Age = age;
		this.skills = skills;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	public Set<SkillsEnum> getSkills() {
		return (skills==null || skills.isEmpty())?defaultSkills:skills;
	}

	public void setSkills(Set<SkillsEnum> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Collab [Name=" + Name + ", Age=" + Age + ", skills=" + skills + "]";
	}
	
	

}
