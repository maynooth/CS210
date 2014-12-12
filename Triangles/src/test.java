/**
 * 
 */

/**
 * @author Xiao Zhenbang
 *
 */
import java.util.*;
import java.math.*;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int amount;
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
		boolean result = true;
		if ((amount > 10) || (amount < 1)) {
			// System.out.println("FALSE");
			result = false;
		} else if ((amount > 0) || (amount < 11)) {
			for (int i = 1; i <= amount; i++) {
				int a, b, a2, b2;
				double length;
				a = in.nextInt();
				b = in.nextInt();
				// System.out.println(a + " " + b);
				if ((0 < a) && (b < 1001)) {
					a2 = a * a;
					b2 = b * b;
					length = Math.sqrt(a2 + b2);
					mainLoop: for (int x1 = 1; x1 <= 1000; x1++) {
						 System.out.println("Enter loop 1");
						for (int y1 = 1; y1 <= 1000; y1++) {
							 System.out.println("Enter loop 2");
							for (int x2 = x1 + 1; x2 <= 1000; x2++) {
								 System.out.println("Enter loop 3");
								for (int y2 = 1; y2 <= 1000; y2++) {
									 System.out.println("Enter loop 4");
									if ((x2 - x1 != 0)&& (length * length - x2 * x2 + 2 * x2
											* x1 + x1 * x1 - y1 * y1 == y2
											* y2 - 2 * y1 * y2)
											&& ((y2 - y1) / (x2 - x1) != 0)) {
										 System.out.println("x2 - x1 != 0 \n"+ length * length + " \n" +((x2*x2-x1*x1)*(x2*x2-x1*x1)+(y2*y2-y1*y1)*(y2*y2-y1*y1)));
										 System.out.println("a:" + a + " b:" +b + " (" + x1 + "," + y1 +") , (" + x2 + "," + y2 + ")");
										// System.out.println("TRUE");
										 System.out.println("Break out 1 TRUE");
										result = true;
										break mainLoop;
									} else {
										// System.out.println("FALSE");
										System.out.println("x2 - x1 != 0 \n "+ length * length + " \n" +((x2*x2-x1*x1)*(x2*x2-x1*x1)+(y2*y2-y1*y1)*(y2*y2-y1*y1)));
										System.out.println("a:" + a + " b:" +b + " (" + x1 + "," + y1 +") , (" + x2 + "," + y2 + ")");
										System.out.println("Break out 1 FALSE");
										result = false;
										//break;
									}
								}
								System.out.println("Break out 2 FALSE");
								//break;
							}
							System.out.println("Break out 3 FALSE");
							//break;
						}
						System.out.println("Break out 4 FALSE");
						//break;
					}
				}
				if (result == true) {
					System.out.println("TRUE");
				} else if (result == false) {
					System.out.println("FALSE");
				}
			}
		} else {
			// System.out.println("FALSE");
			result = false;
			System.exit(0);
		}
	}

}
