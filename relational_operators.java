package relational_operators;

import java.util.Scanner;

public class relational_operators {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To calculate eligible for driving licence ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your age :- ");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println(" You are eligible for drive ");
        }
        else
        {
            System.out.println(" You are not eligible for drive ");
        }

    }
}
