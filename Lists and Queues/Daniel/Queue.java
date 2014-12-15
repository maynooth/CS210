import java.util.*;

public class Queue {
  
  private LinkedList<String> thelist;

  public Queue() {
    thelist = new LinkedList<String>();
  }

  public String insert(String name) {
    thelist.add(name);
    return name;
  }

  public String remove() {
    return (thelist.size() > 0) ? thelist.remove() : "None";
  }

  public boolean isEmpty() {
    return (thelist.size() == 0);
  }

  public int getSize() {
    return thelist.size();
  }

  public void printout() {
    System.out.println("\n" + thelist);
  }
}