package Challenge7_bitwise_operators;
import java.util.Scanner;
public class to_check_even_or_odd_using_bitwise_operator
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" to_check_the_given_number_is_even_or_odd_using_bitwise_operator ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :- ");
        int num = sc.nextInt();
        if((num&1)==1)
        {
            System.out.println(" The given number is odd ");
        }
        else
        {
            System.out.println(" The given number is even ");
        }
    }
}
