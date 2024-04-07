package Challenge5;

import java.util.Scanner;

public class calculate_simple_interest
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Calculate Simple Interest ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Principal value :- ");
        double a = sc.nextDouble();
        System.out.print(" Enter the Rate value :- ");
        double b = sc.nextDouble();
        System.out.print(" Enter the Time value :- ");
        double c = sc.nextDouble();
        double si = (a*b*c)/100;
        System.out.print(" The Simple Interest is :- "+si);
    }
}
