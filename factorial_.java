package Challenge8;

import java.util.Scanner;

public class factorial_ {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("To calculate factorial of a given number");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :- ");
        int a = sc.nextInt();
        long factorial = factorial(a);
        System.out.println("Factorial is :- "+factorial);

    }
    public static long factorial(int a)
    {

        if(a==1||a==0)
        {
            return 1;
        }
        long fact =  1;
        int i = 2;
        while (i<=a)
        {
            fact = fact*i;
            i++;
        }

        return fact;
    }
}
