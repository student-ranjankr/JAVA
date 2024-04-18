package Functions;
import java.util.Scanner;
public class return_
{
    public static void main(String[] args)
    {
        greet();
        int a = read_number();
        int b = read_number();
        int c = read_number();
        int sum = a+b+c;
        System.out.println(" The sum of two numbers is :- "+sum);

    }
    public static void greet()
    {
        System.out.println(" Using return_ ");
    }
    public static int read_number()
    {
    Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your number :- ");
        int num = sc.nextInt();
        return num;

    }
}
