package main;

public class FizzBuzz {

	public static void main(String args[]) {

		for (int num = 1; num <= 100; num++) {

			try {
				Thread.sleep(500);

				if ((num % 3) == 0) {
					System.out.print("Fizz");
				} else if ((num % 5) == 0) {
					System.out.print("Buzz");
				} else if ((num % 3) != 0 && (num % 5) != 0) {
					System.out.print(num);
				}
				System.out.println();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}