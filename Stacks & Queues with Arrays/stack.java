public class stack
{

  private int[] data;
  private int top = -1;
  
  public stack(int size)
  {
    data = new int[size];
  }

  public void push(int value)
  {
    data[++top] = value;
  }

  public int pop()
  {
    return data[top--];
  }

  public int peek()
  {
    return data[top];
  }

  public boolean isEmpty()
  {
    return (top == -1);
  }

  public boolean isFull()
  {
    return (top == data.length - 1);
  }

  public void makeEmpty()
  {
    top = -1;
  }

}