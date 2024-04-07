package Challenge5;

import java.util.Scanner;

public class calculate_celsius {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" calculate_celsius ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Fahrenheit value :- ");
        float a = sc.nextFloat();
        float celsius = (a-32)*5/9;
        System.out.print(" The celsius is :- "+celsius);
    }
}
