package Interface;

public class ClassInterfaceA implements ClassA{
	
	private int a;
	private int b;
	
	
	ClassInterfaceA(int a, int b){
		
		a = this.a;
		b= this.b;
		
	}
	
	public int testMethodA() {
		// TODO Auto-generated method stub
		System.out.println("test");
		return 0;
	}

	
	
	public int testMethodA(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("testmethodA is printing");
		int c = a+b;
		System.out.println(c);
		return c;
		
	}

	
	public void testMethodB() {
		// TODO Auto-generated method stub
		System.out.println("testmethodB is printing");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassInterfaceA obj = new ClassInterfaceA(12, 12);
		obj.testMethodA();
		obj.testMethodB();
		obj.testMethodA(12,13);
		
		

	}	

}
