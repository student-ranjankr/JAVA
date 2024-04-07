package Challenge6;

import java.util.Scanner;

public class calculate_grades {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" To calculate grades based on marks ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your marks :- ");
        int marks = sc.nextInt();
        if(marks>=90)
        {
            System.out.println(" You got 'A' grade ");
        }
        else if(marks>=70)
        {
            System.out.println(" You got 'B' grade ");
        }
        else if (marks>=60)
        {
            System.out.println(" You got 'C' grade ");
        }
        else if (marks>=30)
        {
            System.out.println(" You got 'D' grade ");
        }
        else

        {
            System.out.println(" Fail ");
        }
    }
}
