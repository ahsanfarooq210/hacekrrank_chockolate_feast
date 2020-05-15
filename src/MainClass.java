public class MainClass
{
  static int maximumChocolates(int n, int c, int m) {

    int cupcakes = n / c;

    int totalCupcakes = cupcakes;

    while (cupcakes >= m) {
      cupcakes -= m;

      totalCupcakes++;
      cupcakes++;
    }

    return totalCupcakes;
  }

  public static void main(String[] args)
  {
    System.out.println(maximumChocolates(15,3,2));
  }
}
