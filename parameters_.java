package Functions;

public class parameters_ {
    public static void main(String[] args)
    {
        int c = sumOfTwoNumbers(4,7);
        System.out.println(" Sum of two numbers is :- "+c);
    }
    public static  int sumOfTwoNumbers(int a,int b)
    {
        System.out.println(" First number received :- "+a);
        System.out.println(" Second number received :- "+b);
        int sum = a + b;
        return sum;
    }
}
