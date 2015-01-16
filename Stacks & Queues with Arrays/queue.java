public class queue
{
  
  private int[] data;

  private int front, back, nItems; 
  
  public queue(int size)
  {
    data = new int[size];
    front = 0;
    back = -1;
  }

  public boolean insert(int value)
  {
    if(isFull()) return false;

    if(back == data.length - 1) back = -1; // for wrap around

    data[++back] = value;
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