package OOPS;


public class WtsappV1 {
	public static void main(String[]args) {
		WtsappV3 m=new WtsappV3();
		m.Audiocall();
		m.videocall();
		m.Textmsg();
		
	}

	public void Textmsg() {
		System.out.println("v1");
	}
}

	  class WtsappV2 extends WtsappV1{
		public void Audiocall() {
			System.out.println("v2");
			
		}
	}
		class WtsappV3 extends WtsappV2{
			public void videocall() {
				System.out.println("v3");
			}
		}
			
			
		
	


