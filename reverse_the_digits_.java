package Challenge8;

import java.util.Scanner;

public class reverse_the_digits_ {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to the reverse_the_digits_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :-  ");
        int num = sc.nextInt();
        int reverse = reverse_the_digits(num);
        System.out.println(" Reverse of your number is :- "+reverse);

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
