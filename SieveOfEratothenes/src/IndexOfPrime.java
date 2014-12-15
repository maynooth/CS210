/**
 * @author Xiao Zhenbang
 *
 */
import java.util.Scanner;

public class IndexOfPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0, process = 0;
		if (args.length == 0) {
			System.out.print("The index of prime number: ");
			n = in.nextInt();
			in.close();
		} else {
			try {
				n = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument" + args[0]
						+ " must be an integer.");
				System.exit(1);
			}
		}
		long start = System.currentTimeMillis(); // Time count start
		process = (int) (2 * n * Math.log(n));
		boolean[] table = generatePrimeNumTable(process);
		System.out.println("The prime number is "
				+ getPrimeNumberWithIndex(table, n) + ".");
		long elapsed = System.currentTimeMillis() - start; // Time count end
		System.out.println("The answer took " + elapsed + " ms to compute.");
	}

	/**
	 * Generate the prime number table, every prime number will be marked as
	 * TRUE in the return table.
	 * 
	 * @param Maximum
	 *            The maximum integer (From 2 ~ Maximum).
	 * @return The prime number table.
	 */
	public static boolean[] generatePrimeNumTable(int Maximum) {
		// Declaration
		int n = Maximum + 1;
		boolean[] table = new boolean[n];
		// Initialize the array
		for (int i = 0; i <= table.length - 1; i++) {
			table[i] = true;
		}
		// Generate prime number table
		for (int i = 2; i < table.length; i++) {
			for (int j = 2;; j++) {
				int mul = i * j;
				if (mul > table.length) {
					break;
				}
				if (mul < table.length) {
					table[mul] = false;
				}
			}
		}
		return table;
	}

	/**
	 * Obtain the prime number according to its index.
	 * 
	 * @param originalPNTable
	 *            Original (unsorted) boolean prime number table.
	 * @param index
	 *            The index.
	 * @return The prime number.
	 */
	public static int getPrimeNumberWithIndex(boolean[] originalPNTable,
			int index) {
		int primeNum = 0, count = 0;
		if (index > 2) {
			for (int i = 2; i <= originalPNTable.length - 1; i++) {
				if (originalPNTable[i] == true) {
					count++;
					if (count == index) {
						primeNum = i;
						break;
					}
				}
			}
			return primeNum;
		} else if (index == 1) {
			return 2;
		} else if (index == 2) {
			return 3;
		} else {
			return 0;
		}
	}
}
