package arrays;

import java.util.Scanner;

public class array_searching_
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" Welcome to array searching element ");
        System.out.println();
        int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter the number you want to search :- ");
        int num = sc.nextInt();
       boolean isFound =  isElementFound(arr,num);
       if(isFound)
       {
           System.out.println(" Your number is found in the array ");
       }
       else {
           System.out.println(" Your number is not found in the array ");
       }

    }
    public static boolean isElementFound(int[] arr,int num)
    {
        int index = 0;
        while (index < arr.length)
        {
            if(arr[index]==num)
            {
                return true;
            }
            index++;
        }
        return false;
    }
}
