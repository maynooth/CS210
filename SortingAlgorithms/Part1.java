/**
 * 
 */

/**
 * @author se214099
 *
 */
import java.util.Scanner;

public class Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = { 37, 16, 44, 98, 21, 48, 13 };
		int select;
		System.out
				.print("1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort\n\nSelect one:");
		select = in.nextInt();
		in.close();
		if (select == 1) {
			int tmp = 0;
			for (int i = 0; i < num.length; i++) {
				for (int j = num.length - 1; j > i; j--) {
					if (num[j] < num[j - 1]) {
						tmp = num[j - 1];
						num[j - 1] = num[j];
						num[j] = tmp;
					}
				}
			}
			printArray(num);
			System.exit(0);
		} else if (select == 2) {
			int min;
			for (int i = 0; i < num.length; i++) {
				min = i;
				for (int j = i + 1; j < num.length; j++) {
					if (num[j] < num[min]) {
						min = j;
					}
				}
				swap(i, min, num);
			}
			printArray(num);
		}else if(select == 3){
			for(int i=1;i<num.length;i++){
				int tmp=num[i];
				int j = i;
				while(j>0 && num[j-1]>=tmp){
					num[j]=num[j-1];
					j--;
				}
				num[j]=tmp;
			}
		printArray(num);
		}else{
			System.out.println("Wrong selection.");
			System.exit(0);
		}
	}

	public static void swap(int first, int second, int[] num) {
		int temp = num[first];
		num[first] = num[second];
		num[second] = temp;
	}
	
	public static void printArray(int[] num){
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
