public class LinkedList
{
  
  Link first;

  public LinkedList()
  {
    first = null;
  }

  public void insertHead(int value)
  {
    Link newLink = new Link(value);
    newLink.next = first;
    first = newLink;
  }

  public void insert(int value)
  {
    Link newLink = new Link(value);

    Link current = first;
    while(current.next != null)
    {
      current = current.next;
    }
    current.next = newLink;
  }

  public void deleteValue(int value)
  {
    Link current = first;
    Link previous = first;
    while(current.data != value)
    {
      previous = current;
      current = current.next;
    }

    if(current == first)
    {
      first = first.next;
    }
    else 
    {
      previous.next = current.next; 
    }

  }

}