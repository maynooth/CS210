public class three 
{
  public static void main(String args[])
  {

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

}