package thisex;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personLee = new Person("Lee", 20);
		personLee.showInfow();
		
		Person p = personLee.getSelf();
		personLee.showInfow();
	}

}
