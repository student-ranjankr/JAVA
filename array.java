package arrays;

public class array
{
    public static void main(String[] args)
    {
        System.out.println();
        int  [] myInt = new int[5];
        myInt[0] = 65;
        myInt[1] = 45;
        myInt[2] = 67;
        myInt[3] = 78;
        myInt[4] = 90;
        System.out.println(myInt[2]);
        System.out.println(myInt[0]);
        System.out.println(myInt[4]);
        System.out.println(myInt[3]);
        System.out.println(myInt[1]);
        System.out.println();
        System.out.println();

        int[] a = {10,23,45,65,78};
        System.out.println(a[1]); //23
        System.out.println(a[0]); //10
        System.out.println(a[4]); //78
        System.out.println(a[3]); //65
        System.out.println(a[2]); //45

        int index = 0;
        while (index< a.length)
        {
            System.out.println(a[index]);
            index++;
        }


    }
}
