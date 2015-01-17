import java.util.ArrayList;

public class three 
{
  public static void main(String args[])
  {
    ArrayList<Integer> xs = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
     xs.add(i);
    }

    for (int i : reverse(xs)) {
     System.out.println(i);
    }
  }

  public void reverse(LinkedList head)
  {
    Link oldFirst = head.first;
    Link oldLast = head.last;

    head.first = oldLast;
    head.last = oldNew;

    Link current = head.first;
    while(current.previous != null)
    {
      Link oldPrevious = current.previous;
      current.previous = current.next;
      current.next = oldPrevious;
    }
  }

  // Using standard
  public static <T> ArrayList<T> reverse(ArrayList<T> input) {
    ArrayList<T> xs = new ArrayList<T>();

    for (T x : input) {
      xs.add(0, x);
    }
    return xs;
  }
}