import java.io.*;
import java.util.*;
class Leet_1_easy
{
    public static void main()
    {
        int  s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of encoded array");
        s=sc.nextInt();
        int[] encoded = new int[s];
        System.out.println("Enter the encoded array");
        for(int i=0;i<s;i++)
        encoded[i]=sc.nextInt();
        int first;
        System.out.println("Enter the first element of the coded array");
        first = sc.nextInt();
        int[] arr = new int[s+1];
        arr[0] = first;
        System.out.print(arr[0]+" ");
        for(int i=1; i<s+1; i++) 
        {
            arr[i]=arr[i-1]^encoded[i-1];
    System.out.print(arr[i]+" ");
}
}
}