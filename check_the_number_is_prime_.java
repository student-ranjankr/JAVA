package Challenge8;

import java.util.Scanner;

public class check_the_number_is_prime_ {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" welcome to check_the_number_is_prime_or_not_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter  your number :- ");
        int num = sc.nextInt();
        System.out.println();
       boolean isPrime = check_the_number_is_prime(num);
       if(isPrime) {
           System.out.println(" Given number is prime number ");
       }
       else
       {
           System.out.println(" Your number is not prime number ");
       }
    }
    public static boolean check_the_number_is_prime(int num)
    {
        int i =2;
        while (i<num)
        {
            if(num%i==0)
            {
                return false;
            }
            i++;
        }

      return true;

    }
}
