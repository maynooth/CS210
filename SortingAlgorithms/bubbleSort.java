
	
public class bubbleSort {
	
	public static void main(String[] args) {

		// Initilise the array.
		int[] array = {17,2,1,3,5,4,10,64};

		// Initilise you temp that will help you swap elements in your array
		int temp;

		// Iinitilise your boolean.
		boolean fixed = false;

		// Go through every index in the array and if
		// the element before is bigger than the one ahead
		// swap them around and set boolean fixed to false, this will
		// make the while loop run again.
		// If your if loop won't run then your array is sorted and
		// the boolean fixed will be left to true, the while loop 
		// will end and you will have a sorted array :).

		while(fixed == false) {

			fixed=true;

			for(int inner=0; inner<array.length-1; inner++) {

				// If your array at the current index is > than the next
				// index in the array, swap them
				if(array[inner] > array[inner+1]) {
					temp = array[inner];
					array[inner] = array[inner +1];
					array[inner +1] = temp;
					fixed = false;
				}
			}
		}

		// Print out the sorted array array.

		for(int i =0; i<array.length; i++) {
			System.out.println("Your array at ["+i+"] is " + array[i]);
		
		}
	}

	
}