public class TriangularNumber 
{

  public static void main(String args[])
  {
    System.out.println(triangularNthTerm(3));
  }

  public static int triangularNthTerm(int n)
  {
    if(n == 1) return 1;
    return triangularNthTerm(n - 1) + n;
  }

}