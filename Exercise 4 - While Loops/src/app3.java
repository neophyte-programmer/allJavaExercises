//Write a program to calculate the sum of first 10 natural number.
public class app3 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		
		while (number <= 10)
		{
			sum += number;
			number++;
		}
		System.out.println("Sum: " + sum);
	}

}
