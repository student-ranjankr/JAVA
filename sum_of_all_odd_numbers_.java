package Challenge8;

import java.util.Scanner;

public class sum_of_all_odd_numbers_
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" Welcome to sum_of_all_odd_numbers_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your number :- ");
        int a = sc.nextInt();
        System.out.println();
        int sum = sum_of_all_odd_numbers(a);
        System.out.println(sum);


    }
    public static int sum_of_all_odd_numbers(int a)
    {
        int sum = 0;
        int i = 1;
        while(i<=a)
        {
            sum = sum + i;
            i+=2;
        }
        return sum;
    }

}
