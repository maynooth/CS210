/**
 * 
 */
import java.util.*;

/**
 * @author stark
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 1;
		if (args.length == 0) {
			System.out.print("Enter the index of Fibonacci number: ");
			n = in.nextInt();
			in.close();
			System.out.println(fibGetIndex(n));			//Change the function.
			// printFibList(n);
		} else if (args[0].equals("-list")) {
			try {
				printFibList(Integer.parseInt(args[1]));
			} catch (NumberFormatException e) {
				System.err.println("Argument: " + args[1] + " must be an integer.");
				System.exit(1);
			}
		} else if (args[0].equals("-index")) {
			try {
				System.out.println(fibGetIndex(Integer.parseInt(args[1])));
			} catch (NumberFormatException e) {
				System.err.println("Argument: " + args[1] + " must be an integer.");
				System.exit(1);
			}
		} else {
			System.out.println("\nDetermine the Fibonacci sequence.\n   java Fibonacci ([-index|-list] indexNumber) | [-help]");
			System.out.println("\n\t-index indexNumber     Print out the indexNumber-th Fibonacci number.");
			System.out.println("\n\t-list indexNumber      Print out the whole list of Fibonacci numbers less than the content of indexNumber.");
			System.out.println("\n\t-help                  Print out this help screen.\n");
		}
	}

	public static long fibGetIndex(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return fibGetIndex(n - 1) + fibGetIndex(n - 2);
		}
	}

	public static void printFibList(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 10 != 0) {
				System.out.print(fibGetIndex(i) + " ");
			} else {
				System.out.println(fibGetIndex(i));
			}
		}
		System.out.println();
	}
}
