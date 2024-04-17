package datatypes_variables_input;
import java.util.Scanner;
public class userInput
{
    public static void main(String[] args)
    {
       System.out.println();
       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name :- ");
        String str = sc.nextLine();
        System.out.println("Good Morning " +str);
        System.out.println(str+ " ,Also tell me your age");
        int age = sc.nextInt();
        System.out.println(" Your age is " +age);

    }
}
