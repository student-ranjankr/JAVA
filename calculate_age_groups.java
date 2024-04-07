package Challenge6;

import java.util.Scanner;

public class calculate_age_groups {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To calculate a_person_into_different_age_groups ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your age :- ");
        int age = sc.nextInt();

        if(age<=13)
        {
            System.out.println(" You are child 'Complain piyo'");
        }
        else if (age<=20)
        {
            System.out.println(" You are teen ");
        }
        else if(age<=60)
        {
            System.out.println(" You are adult ");
        }
        else
        {
            System.out.println(" You are Senior citizen ");
        }
    }
}
