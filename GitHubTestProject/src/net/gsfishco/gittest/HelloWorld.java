package net.gsfishco.gittest;

public class HelloWorld {
	
	public static void main(String[] args) {
		String[] names = {"George", "Scott", "John"};
		
		for (int i = 0; i < 10; i++) {
		String name = names[i%3];
			System.out.println("Hello and Good Morning World on day " + i + " from " + name + "!");
		}
	}

}
