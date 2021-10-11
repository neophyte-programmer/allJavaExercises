
public class app1 {

	public static void main(String[] args) {
		/*
		 * First section of the for loop condition contains code that will execute before the loop starts
		 * The first section of the loop condition is where the loop counter is declared and initialised .e.g.int i = 0
		 * The 2nd section of the for loop condition is the actual condition which runs the code until the condition is violated
		 * in other words, if the condition is true, the loop will run
		 * eg. i < 5; the loop will run until i is no longer less than five
		 * the last part of the for loop condition is a condition that will execute once after each iteration
		 * it is usually used in incrementing or decrementing a value, mostly the loop counter
		 * eg. i++; after each iteration of the loop, i will increase by one until the condition is not true
		 */
		for (int i = 0; i < 5; i++ ) {
			System.out.printf("The value of i is: %d\n", i);
		}
	}

}
