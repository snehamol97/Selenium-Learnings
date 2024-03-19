package TestSelenium.Selenium1;

public class Constructor {
	
	int num1, num2 ;
	
	Constructor(){
		num1 = 0;
		num2 = 0;
		System.out.println("test constructor");
		
	}

		
		public Constructor(int x) {
		num1 = x;
		num2 = 0;
		System.out.println(num1 + num2);
		}
		public Constructor(int x, int y) {
		num1 = x;
		num2 = y;
		
		System.out.println(num1 + num2);
		}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj2 = new Constructor(2);
	    Constructor obj3 = new Constructor(2, 3);
		Constructor obj = new Constructor();
		
		
		

	}

}
