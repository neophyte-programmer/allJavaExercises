
public class application {

	public static void main(String[] args) {
		String text = "Hello";
		String blank = " ";
		String name = "Fafa";
		String greeting = text + blank + name;
		
		//Strings can be outputted in the ff ways in Java
		System.out.println(greeting);
		//or
		System.out.println(text + blank + name);
		//or
		System.out.println("Hello" + " " + "Fafa"); // This method is quite literaaly pointless cause there are better ways to output info
		
		//Strings can also be concatenated with other data types
		int age = 18;
		System.out.println("I am " + age + " years old.");
	}

}
