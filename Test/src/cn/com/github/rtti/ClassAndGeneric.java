package cn.com.github.rtti;

class build{}

class PersonBuild extends build{}

public class ClassAndGeneric {
	

	public static void main(String[] args) {
		build build =  new build();
		Class<? extends build> person = PersonBuild.class;
		PersonBuild secondePerson = (PersonBuild) person.cast(build);
		secondePerson = (PersonBuild) build;
	}
}
