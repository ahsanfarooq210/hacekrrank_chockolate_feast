public class Solution
{
  public static void main(String[] args)
  {
    System.out.println(chocolateFeast(15, 3, 2));
  }

  public static int chocolateFeast(int n, int c, int m)
  {
    int chockolate = n / c;
    int maxChockolate = chockolate;

    while (chockolate >= m)
    {
      chockolate -= m;
      maxChockolate++;
      chockolate++;
    }
    return maxChockolate;

  }
}
