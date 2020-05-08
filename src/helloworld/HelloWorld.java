package helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World2!"); 
		
		int number = 5+5-1;
		
		int number2 = ten();
		
		System.out.println(number2 + ":" + (number + 1));
		System.out.println("새로 수정된 거");
		
	}
	
	public static int ten() {
			return 10;
	}

}
