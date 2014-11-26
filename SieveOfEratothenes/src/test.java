public class test {
	public static void main(String[] args) {
		int count = 0;
		int in = 50;
		int num = (int)(2*in*Math.log(in));
		boolean[] myArray = new boolean[num];
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
		for (int k = 2; k < myArray.length; k++) {
			if (myArray[k] == true) {
				count++;
				if (in == count) {
					System.out.println(k);
					break;
				}
			}
		}
	}
}