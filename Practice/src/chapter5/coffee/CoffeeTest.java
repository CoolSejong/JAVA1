package chapter5.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTEE);
	}

}
