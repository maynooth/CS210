import java.util.Scanner;

/**
 * @author stark
 *
 */
public class triNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		if (args.length == 0) {
			System.out.print("Enter the n-th term of triangular number: ");
			n = in.nextInt();
			in.close();
			System.out.println(recurTriNum(n));			// Choose the function
			// listTriNum(n);
		} else if (args[0].equals("-list")) {
			try {
				listTriNum(Integer.parseInt(args[1]));
			} catch (NumberFormatException e) {
				System.err.println("Argument: " + args[1] + " must be an integer.");
				System.exit(1);
			}
		} else if (args[0].equals("-index")) {
			try {
				n = Integer.parseInt(args[1]);
				System.out.println(recurTriNum(n));
			} catch (NumberFormatException e) {
				System.err.println("Argument: " + args[1] + " must be an integer.");
				System.exit(1);
			}
		} else {// if (args[0].equals("-help")) {
			System.out.println("\nFind the triangular number.\n   java triNum ([-index|-list] indexNumber) | [-help]");
			System.out.println("\n\t-index indexNumber     Print out the indexNumber-th triangular number.");
			System.out.println("\n\t-list indexNumber      Print out the whole list of triangular numbers less than the content of indexNumber.");
			System.out.println("\n\t-help                  Print out this help screen.\n");
		}
	}

	/**
	 * Find the triangular number with given index.
	 * 
	 * @param input
	 *            Index
	 * @return The number
	 */
	public static int recurTriNum(int input) {
		if (input == 1) {
			return 1;
		} else if (input > 1) {
			return input + recurTriNum(input - 1);
		} else {
			return 0;	// If the index is less than 1 it will give 0.
		}
	}

	/**
	 * Print out the whole list of triangular from 1 to the given index.
	 * 
	 * @param input
	 *            Index
	 */
	public static void listTriNum(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print(recurTriNum(i) + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
