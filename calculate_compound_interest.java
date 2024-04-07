package Challenge5;

import java.util.Scanner;

public class calculate_compound_interest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Calculate Compound Interest ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Principal value :- ");
        double a = sc.nextDouble();
        System.out.print(" Enter the Rate value :- ");
        double b = sc.nextDouble();
        System.out.print(" Enter the Time value :-");
        double c = sc.nextDouble();
        double ci = a*(1+b/100)*c;
        System.out.print(" The Compound Interest is :- "+ci);


    }
}
