
public class Japaneserestaurant {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sushi a1 = new Charcoal();
		System.out.println(a1.getDescription() + " $"+a1.cost());

		Sushi b2 = new Jasminerice();
		b2 = new Tuna(b2);
		b2 = new Seaweed(b2);
		System.out.println(b2.getDescription() + " $"+b2.cost());
		
		Sushi c1 = new Jasminerice();
		c1 = new Seaweed(c1);
		c1 = new Salmonroe(c1);
		c1 = new Tuna(c1);
		System.out.println(c1.getDescription() + " $"+c1.cost());
	}
}
