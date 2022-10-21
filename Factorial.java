import java.util.*;
class Factorial {
    static int factorial(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
          res *= i;
        return res;
    }
    public static void main(String[] args)
    {
        int num ;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any num :");
	num = sc.nextInt();
        System.out.println("Factorial of " + num+ " is: " + factorial(num));
    }
}