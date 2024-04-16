package Challenge8;

import java.util.Scanner;

public class least_common_multiple_
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Welcome to least_common_multiple_ ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your first number :- ");
        int a = sc.nextInt();
        System.out.print(" Please enter your second number :- ");
        int b = sc.nextInt();
        System.out.println();
        int lcm = least_common_multiple(a,b);
        System.out.println();
        System.out.print(" The least_common_multiple of two number is :- "+lcm);

    }
    public static int least_common_multiple(int a,int b) {
        //LOGIC:-
        int i = 1;
        while (i <= b)
        {
            int factor = a * i;
            if (factor % b == 0)
            {
                return factor;
            }
            i++;
        }
        return 0;
    }
}
