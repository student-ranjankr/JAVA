package Challenge6;

import java.util.Scanner;

public class the_number_is_positive_negative_zero {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To Calculate the_number_is_positive_negative_zero ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your Number :- ");
        int number = sc.nextInt();
        if(number==0)
        {
            System.out.println(" The number is zero ");
        } else if (number>0)
        {
            System.out.println(" The number is positive ");
        }
        else
        {
            System.out.println(" The number is negative ");
        }
    }
}
