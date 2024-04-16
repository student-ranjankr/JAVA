package Challenge8;

import java.util.Scanner;

public class multiplication_table_
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Welcome to multiplication table");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your number :- ");
        int a = sc.nextInt();
        System.out.println();
        printMultiplicationTable(a);
    }
    public static void printMultiplicationTable(int a)
    {
        int i = 1;
        while(i<=10)
        {
            System.out.println(a+ " X "+ i + " = "+(a*i));
            i++;
        }
    }
}
