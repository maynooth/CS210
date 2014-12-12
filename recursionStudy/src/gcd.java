/**
 * 
 */

/**
 * @author stark
 *
 */
public class gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGCD(22,77));
	}
	
	public static int getGCD(int numerator, int denominator){
		if(denominator==0){
			return numerator;
		}else{
			return getGCD(denominator,numerator%denominator);
		}
	}

}
