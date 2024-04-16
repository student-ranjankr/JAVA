package Challenge8;

import java.util.Scanner;

public class multiplication_of_a_table_
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to multiplication world ");
        System.out.print(" Please enter your number :- ");
        int number = sc.nextInt();
        printMultiplicationTable(number);

    }
    public static void printMultiplicationTable(int number)
    {
        int i =1;
        while (i<=10)
        {
            System.out.println(number+ " X " + i + " = "+(number*i));
            i++;

        }
    }
}
