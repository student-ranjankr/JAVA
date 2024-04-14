package Challenge7_bitwise_operators;

import java.util.Scanner;

public class bitwise_compliment_operators {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To show bitwise compliment of a number ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter a number :- ");
        int a = sc.nextInt();
        int b = ~a;
        System.out.println(" After performing bitwise compliment operator :- "+b);
    }
}
