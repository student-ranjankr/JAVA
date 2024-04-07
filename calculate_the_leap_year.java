package Challenge6;

import java.util.Scanner;

public class calculate_the_leap_year
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" To calculate the given year is leap year or not ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter the year :- ");
        int year = sc.nextInt();
        if(year%400==0)
        {
            System.out.println(" The given year is leap year ");
        }
        else if (year%100==0)
        {
            System.out.println(" The given year is not leap year ");
        }
        else if (year%4==0)
        {
            System.out.println(" The given year is leap year ");
        }
        else
        {
            System.out.println(" The given year is not a leap year ");
        }

    }
}
