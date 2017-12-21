
public class Person {

	String name;
	String lastName;
	int age;
	
	public Person() {
		name = "nie_podano";
		lastName = "nie_podano";
		age = -1;
	}
	
	public Person(String n, String lN, int a){
		name = n;
		lastName = lN;
		age = a;
	}
	
	public Person(Person person) {
		name = person.name;
		lastName = person.lastName;
		age = person.age;
	}
}

