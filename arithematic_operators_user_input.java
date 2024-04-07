package Challenge5;

import java.util.Scanner;

public class arithematic_operators_user_input {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to Our Calculator : ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the first number :- ");
        int a = sc.nextInt();
        System.out.print(" Enter the second number :- ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" The sum of two numbers is :- "+sum);
        int sub = a-b;
        System.out.println(" The subtract of two numbers is :- "+sub);
        int mul = a*b;
        System.out.println(" The multiply of two numbers is :- "+mul);
        int div = a/b;
        System.out.println(" The divide of two numbers is :- "+div);
        int mod = a%b;
        System.out.println(" The modulus of two numbers is :- "+mod);
    }
}
