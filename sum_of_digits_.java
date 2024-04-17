package Challenge8;

import java.util.Scanner;

public class sum_of_digits_ {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to sum_of_digits_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :- ");
        int num = sc.nextInt();
        int sum = sum_of_digits(num);
        System.out.print("Sum of the digits is :- "+sum);
    }
    public static int sum_of_digits(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum = sum + (num%10);
            num = num /10;

        }
        return sum;

    }
}
