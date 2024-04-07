package Challenge5;

import java.util.Scanner;

public class area_of_triangle
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" Calculate of area of triangle ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the base of triangle :- ");
        double a = sc.nextFloat();
        System.out.print(" Enter the height of triangle :- ");
        double b = sc.nextFloat();
        double triangle = 0.5*a*b;
        System.out.println(" Area of triangle :- "+triangle);
    }
}
