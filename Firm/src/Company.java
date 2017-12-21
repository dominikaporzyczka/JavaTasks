
public class Company {
	
	public static void main(String[] args) {
		
		Person [] employees = new Person[3];
		employees[0] = new Person();
		employees[1] = new Person("Andrzej", "Kowalski", 23);
		employees[2] = new Person(employees[1]);
		
		for (Person p: employees) {
			System.out.println("pracownik: " + p.name + " " + p.lastName + " " + p.age);
		}

	}
}
