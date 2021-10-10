
public class Application {

	public static void main(String[] args) {
		int myNumber = 88; //int is a 32 bit value datatype
		short myShort = 245; //short is like int but 16 bit value datatype
		long myLong = 12377782; //long is like int but 64 bit value datatype
		double myDouble = 15.67; //double is for floating point numbers
		float myFloat = 98.33f; //float holds smaller floating point numbers
		//In Java, when using float, the number is automatically a double until you add f at the end
		
		char myChar = '&'; //char holds a unicode value which is surrounded by single quotes
		boolean myBool = true; //can only hold the values true or false
		byte myByte = 127; //holds 8 bits of data
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBool);
		System.out.println(myByte);
	}

}
