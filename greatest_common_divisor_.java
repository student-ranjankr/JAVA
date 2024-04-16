package Challenge8;

import java.util.Scanner;

public class greatest_common_divisor_ {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to greatest_common_divisor_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your first number :- ");
        int a = sc.nextInt();
        System.out.print(" Please  enter your second number :- ");
        int b = sc.nextInt();
        System.out.println();
        int gcd = greatest_common_divisor(a,b);
        System.out.println();
        System.out.print(" The greatest_common_divisor of two number is  :-  "+gcd);
    }
    public static int greatest_common_divisor(int a,int b)
    {
        int gcd = 1;
        int i = 2;
        int least = least(a,b);
        while (i<=least)
        {
            if(a%i==0&&b%i==0)
            {
                gcd = i;
            }
            i++;
        }
        return gcd ;
    }
    public static int least(int a,int b)
    {
        if(a<b)
        {
            return a;
        }
        else
        {
            return  b;
        }
    }
}
