/**
 * @author Xiao Zhenbang
 *
 */
import java.util.Scanner;

public class Solution {
	//Initialize global variables
	public static int count = 0, n = 0;

	public static void main(String[] args) {
		if(args.length==0){
		//Initialize main method variables
		Scanner in = new Scanner(System.in);
		System.out.print("How many number the array covered:");
		n = in.nextInt() + 1;
		in.close();
		}else{
			try{
				n=Integer.parseInt(args[0])+1;
			} catch (NumberFormatException e) {
				System.err.println("Argument" + args[0]
						+ " must be an integer.");
				System.exit(1);
			}
		}
		long start = System.currentTimeMillis();
		boolean[] num = new boolean[n];
		for (int i = 0; i <= num.length - 1; i++) {
			num[i] = true;
		}
		//Discover prime numbers
		for (int i = 2; i < num.length; i++) {
			for (int j = 2;; j++) {
				int mul = i * j;
				if (mul > num.length) {
					break;
				}
				if (mul < num.length) {
					num[mul] = false;
				}

			}
		}
		//Print out
		for (int i = 2; i <= num.length - 1; i++) {
			if (num[i] == true) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) {		//Change line procedure
					System.out.println();
				}
			}
		}
		finalCount();
		long elapsed = System.currentTimeMillis() - start;	//Time count end
		System.out.println("The answer took " + (double)(elapsed)/(double)(1000) + " s to compute.");
	}
	/**
	 * Plural grammar process procedure.
	 */
	public static void finalCount() {
		System.out.print("\n\nThere ");
		if (count == 1) {
			System.out.print("is 1 prime number, which is 2.\n");
		} else if (count > 1) {
			System.out.print("are " + count + " prime numbers from 2 to "
					+ (n - 1) + ".\n");
		}
	}
}
