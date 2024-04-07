package Challenge5;

import java.util.Scanner;

public class floating_product
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Welcome to Our Product machine \uD83D\uDE00 \uD83D\uDE00 \uD83D\uDE00 :- ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the first number :- ");
        float a = sc.nextFloat();
        System.out.print(" Enter the second number :- ");
        float b = sc.nextFloat();
        float c = a*b;
        System.out.println(" The product of two number is :- "+c);
    }
}
