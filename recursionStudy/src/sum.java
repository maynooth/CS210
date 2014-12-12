/**
 * 
 */

/**
 * @author stark
 *
 */
public class sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int test[]={1,2,3,4,5,6,7,8,2000};
		System.out.println(recurSum(test,0));

	}
	
	public static int recurSum(int input[],int index){
		if(index==input.length-1){
			return input[index];
		}else{
			return input[index] + recurSum(input, index +1);
		}
	}
}
