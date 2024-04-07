package Challenge4;

import java.util.Scanner;

public class user_input_swap_number {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome the swapping station : ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the first number :- ");
        int a = sc.nextInt();
        System.out.print(" Enter the second number :- ");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println(" After swapping the number : ");
        System.out.println(" The first number is :- "+a);
        System.out.print(" The second number is :- "+b);

    }
}
