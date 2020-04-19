package OOPS;
class Animals{
	void eat() {
		System.out.println("eating");
	}
}
class Doggy extends  Animals{
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends  Animals{
	void meow() {
		System.out.println("meowing");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.eat();
		c.meow();
		//c.bark();

	}

}
