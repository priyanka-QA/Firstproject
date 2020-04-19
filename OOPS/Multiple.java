package OOPS;
class Aaaa{
	public void msg() {
		System.out.println("hiii");
	}
}
class Bbbb{
	public void msg() {
		System.out.println("helloo");
	}
}

 class Multiple extends  Aaaa,Bbbb{
 
	
	 public  static void main(String[] args) {
		 Multiple m = new Multiple();
		 m.msg();
		 
		 }
		// TODO Auto-generated method stub

	}
 }
 
