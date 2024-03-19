package Polymorphism;

public class ClassB extends ClassA{
	
	static String s ="the sun is";
	static String[] a = s.split(" ");

	
public static int oper(int a , int b) {
		
		int sub;
		sub = a -b;
		System.out.println(sub);
		return sub;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA.oper(2, 9);
		ClassB.oper(2, 2);
		for(String words: a) {
			System.out.println(words);	
		}
		
		

	}

}
