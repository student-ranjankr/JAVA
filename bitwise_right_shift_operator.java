package Challenge7_bitwise_operators;

import java.util.Scanner;

public class bitwise_right_shift_operator {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To show use of right shift operator ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter a number :- ");
        int a = sc.nextInt();
        int b = a>>1;
        System.out.println(" After performing bitwise right_shift operator :- "+b);
    }
}
