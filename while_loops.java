package Loops;

import java.util.Scanner;

public class while_loops {
    public static void main(String[] args) {
//        System.out.println();
//        System.out.println(" Using While Loop ");
//        System.out.println();
//        int num = 1;
//        while (num<=10)
//        {
//            System.out.println(num);
//            num = num+1;
//        }

        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (a<5)
        {
            int b = sc.nextInt();
            System.out.println(" Number is :- "+b);
            a = a+1;
        }
    }
}
