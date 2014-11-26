import java.util.Scanner;

public class checkprimes {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter prime to find");
		int num = scan.nextInt();
		int length = (int) (2 * num * Math.log(num));

		boolean[] myArray = new boolean[length];
		long start = System.currentTimeMillis();

		for (int i = 2; i < myArray.length; i++) {
			myArray[i] = true;
		}

		for (int i = 2; i < myArray.length; i++) {
			for (int j = 2;; j++) {
				int mul = i * j;
				if (mul > myArray.length) {
					break;
				}
				if (mul < myArray.length) {
					myArray[mul] = false;
				}

			}
		}
		int counter = 0;
		for (int k = 2; k < myArray.length; k++) {

			if (myArray[k] == true) {
				counter++;
				if (num == counter) {
					System.out.println(k);
					long elapsed = System.currentTimeMillis() - start;
					System.out.println("The time taken is " + elapsed);
					break;

				}
			}

		}

	}
}