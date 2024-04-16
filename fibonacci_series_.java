package Challenge8;

import java.util.Scanner;

public class fibonacci_series_
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to fibonacci_series_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the number upto which series has to be printed :- ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print(" Here is the fibonacci_series ");
        fibonacci_series(a);

    }
    public  static void fibonacci_series(int a)
    {
        if(a<0) return;
        System.out.print("0 ");
        if(a==0) return;

        int first = 0 , second = 1;
        while(first + second <= a)
        {
            int third = first + second ;
            System.out.print(third+" ");
            first = second;
            second = third;

        }
    }
}
