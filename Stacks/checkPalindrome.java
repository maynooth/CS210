/*
*
* Pushes each char of the word to stack, pops them out to get the reverse and checks if the word is palindrome.
*
* @author Daniel Paul
* @date 27/11/12
* @version 1.0
*
*/

import java.util.Scanner;
import java.util.Stack;

public class checkPalindrome {

  public static void main(String args[]) {

    Stack<Character> myStack = new Stack<Character>();

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter word to check: ");
    
    String word = scan.nextLine().toLowerCase();
    for(char c : word.toCharArray()) myStack.push(c);

    String reversed = "";
    while(!myStack.isEmpty()) reversed += myStack.pop();

    System.out.println("'" + word + "' is" + ((word.equals(reversed)) ? "" : " NOT") + " a palindrome.");
  }

}