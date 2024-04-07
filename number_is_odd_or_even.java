package Challenge6;

import java.util.Scanner;

public class number_is_odd_or_even {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To Calculate the number_is_odd_or_even ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :- ");
        int number = sc.nextInt();
        if(number%2==0)
        {
            System.out.println(" The number is even ");
        }
        else
        {
            System.out.println(" The number is odd ");
        }
    }
}
