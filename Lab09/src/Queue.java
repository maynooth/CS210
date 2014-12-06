import java.util.LinkedList;

/**
 * @author stark
 *
 */
public class Queue {
	private LinkedList<String> thelist = new LinkedList<String>();
	private int size;

	public Queue(){
		
	}
	public Queue(int sizein) {
		super();
		size = sizein;
	}

	public void insert(String name) {
		thelist.add(name);
	}

	public void remove() {
		if (thelist.isEmpty() == false) {
			String getFirst = thelist.getFirst();
			thelist.removeFirst();
			System.out.println(getFirst + " has been removed from the queue.");
			System.out.println("The size of the queue is " + thelist.size() + ".\n");
		} else {
			System.out.println("The list is empty.\n");
		}
	}

	public boolean isEmpty() {
		if (thelist.isEmpty() == true) {
			return true;
		} else {
			return false;
		}
	}

	public int getSize() {
		return thelist.size();
	}

	public void printout() {
		System.out.println(thelist + "\n");
	}
}
