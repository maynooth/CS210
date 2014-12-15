import java.util.Scanner;

public class lab9 {

	public static void main(String[] args) {
		Queue myqueue = new Queue();
		Scanner in = new Scanner(System.in);
		String command = "";
		while (!command.equals("q")) {
			System.out.print("[1]Insert, [2]Remove, [3]Get size [4]List or [q]Quit? ");
			command = in.nextLine();
			if (command.equals("1")) {
				System.out.print("Enter name to insert: ");
				String name = in.nextLine();
				myqueue.insert(name);
				System.out.println("\"" + name + "\" has been inserted into the queue.");
				System.out.println("The size of the queue is " + myqueue.getSize() + ".\n");
			} else if (command.equals("2")) {
				myqueue.remove();
			} else if (command.equals("3")) {
				System.out.println("The size of the queue is " + myqueue.getSize() + ".\n");
			} else if (command.equals("4")) {
				myqueue.printout();
			} else if(command.equals("q")){
				break;
			} else {
				System.out.println("\"" + command + "\" is a wrong command. \n");
			}
		}
		in.close();
		System.exit(0);
	}
}
