/*
*
* Asks the user for a word and pushes each char to a stack. Then pops each char and prints it out to reverse the word. 
* Also prints our how the stack is changing.
*
* @author Daniel Paul
* @date 27/11/12
* @version 1.0
*
*/

import java.util.Scanner;
import java.util.Stack;

public class reverseWord {

  public static Stack<Character> myStack = new Stack<Character>();

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter word to reverse: ");
    String word = scan.nextLine();

    for(char c : word.toCharArray()) {
      myStack.push(c);

      System.out.println("Push " + c + ":");
      printStack();
    }


    String reversed = "";

    while(!myStack.isEmpty()) {
      char popped = myStack.pop();
      reversed += popped;

      System.out.println("Pop " + popped + ":");
      printStack();
    }

    System.out.println("Reversed: " + reversed);
  }


  private static void printStack() {
    Stack printStack = (Stack) myStack.clone();

    if(printStack.size() > 0) System.out.println("   ___"); else System.out.println("Stack is empty.");
    for(int i = printStack.size() - 1; !printStack.isEmpty(); i--) System.out.println(i + " |_" + printStack.pop() + "_|");

    System.out.println("\n");
  }

}