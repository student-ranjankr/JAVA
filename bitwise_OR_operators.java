package Challenge7_bitwise_operators;

import java.util.Scanner;

public class bitwise_OR_operators {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To show bitwise OR of two numbers ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your first number :- ");
        int a = sc.nextInt();
        System.out.print(" Please enter your second number :- ");
        int b = sc.nextInt();
        int c = a|b;
        System.out.println(" After performing bitwise OR operator :- "+c);
    }
}
