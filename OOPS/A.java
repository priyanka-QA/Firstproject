package OOPS;

public class A {

	public static void main(String[] args) {
		C obj = new C();
		obj.methodA();
		obj.methodB();
	}
}

class B {
	public void methodA() {
		System.out.println("base class is runing by Vishalaaaa");

	}
}

class C extends B {
	public void methodB() {
			System.out.println("super class is runing");
		}
}