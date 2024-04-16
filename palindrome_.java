package Challenge8;

import java.util.Scanner;

public class palindrome_ {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to the reverse_the_digits_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :-  ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);

        if(isPalindrome) {
            System.out.println(" Your number is a palindrome number ");
        }
        else
        {
            System.out.println(" your number is not a palindrome number ");
        }

    }
    public static boolean isPalindrome(int num)
    {
        int reverse = reverse_the_digits(num);

        return num == reverse;
    }
    public static int reverse_the_digits(int num)
    {
        int newNum = 0;
        while (num>0)
        {
            int digit = num%10;
            newNum = newNum*10+digit;
            num = num/10;
        }
        return  newNum;
    }
}
