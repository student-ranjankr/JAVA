package Challenge6;

import java.util.Scanner;

public class greatest_of_three_number {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To Calculate the greatest_of_three_number ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your first number :- ");
        int a = sc.nextInt();
        System.out.print(" Please enter your second number :- ");
        int b = sc.nextInt();
        System.out.print(" Please enter your third number :- ");
        int c = sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.print(" The greatest number is :- "+a);
        }
        else if (b>=a && b>=c)
        {
            System.out.println(" The greatest number is :-  "+b);
        }
        else
        {
            System.out.println(" The greatest number is :- "+c);
        }

    }
}
