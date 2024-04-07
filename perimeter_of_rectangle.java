package Challenge5;

import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Calculate Perimeter of Rectangle ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the first side :- ");
        float a = sc.nextFloat();
        System.out.print(" Enter the second side :- ");
        float b = sc.nextFloat();
        System.out.print(" Enter the third side :- ");
        float c = sc.nextFloat();
        System.out.print(" Enter the fourth side :- ");
        float d = sc.nextFloat();
        float peri = a+b+c+d;
        System.out.print(" Perimeter of Rectangle is :- "+peri);
    }
}
