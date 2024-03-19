package Abstraction;

public abstract class ClassAbstract {
	
	private String valueA= "Test";
	private String valueB = "test";
	
	
	ClassAbstract() {
		this.valueA = valueA;
		this.valueB = valueB;
	}
	
	public void testA(String valueA , String valueB) {
		
		valueA = "hello world";
		valueB = "testb";
		
		System.out.println(valueA);
		
		System.out.println(valueB);
		
	}
	
	abstract void testB();

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
