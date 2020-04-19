package OOPS;
class Cat1{
	void eat() {
		System.out.println("eatinng");
	}
}
class Cat2 extends Cat1{
	
	void bark() {
	System.out.println("crying");
}
}
	class Cat3 extends Cat2{
		void weep() {
			System.out.println("weeping");
		}
	}
	
public class Multilevel {

	public static void main(String[] args) {
		Cat3 c= new Cat3();
		c.bark();
		c.eat();
		c.weep();

	}
}


