import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    p3();
  // max(5);
  // p1();
  }
  public static void p1()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Input numbers >0, -1 to end.");
      int n = sc.nextInt();
      System.out.println("n is " + n);
      while (n != -1)
      {
        n += sc.nextInt();
        System.out.println("n is " + n);
      }
      System.out.println("Your total is " + n);
    }
  public static void max(int n)
  { 
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int max = 0;
    while (i < n)
    {
      System.out.println("Input a number");
      int num = sc.nextInt();
      if (num > max)
      {
        max = num;
      }
      i++;
    }
    System.out.println("Max: " + max);
  }
  public static void p3()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a word");
    String word = sc.nextLine();
    int i = 0;
    int len = word.length();
    String ans = "";
    while (i < len)
    {
      if ( (i+1) % 3 != 0)
      {
      ans += word.substring(i, i+1);
      }
      i++;
    }
    System.out.println(ans);
  }
}
