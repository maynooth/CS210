public class pqueue
{
  
  private int[] data;

  private int front, back, nItems; 
  
  public pqueue(int size)
  {
    data = new int[size];
    front = 0;
    back = -1;
  }

  public boolean insert(int value)
  {
    if(isFull()) return false;

    if(back == data.length - 1) back = -1; // for wrap around

    if(isEmpty())
    {
      data[++back] = value;
      return true;
    }

    // if not empty
    int j = nItems;
    while(j > 0 && data[j - 1] > value)
    {
      data[j] = data[j - 1];
      j--;
    }
    data[j] = value;

    nItems++;
    return true;
  }

  public int remove()
  {
    if(isEmpty()) return 0;

    int temp = data[front++];

    if(front == data.length) front = 0;

    nItems--;
    return temp;
  }

  public boolean isFull()
  {
    return (back == data.length - 1);
  } 

  public boolean isEmpty()
  {
    return (nItems == 0);
  }


  public int peekFront()
  {
    return data[front];
  }

  public int size()
  {
    return nItems;
  }

}