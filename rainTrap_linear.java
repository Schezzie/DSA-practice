import java.util.*;
import java.io.*;
public class rainTrap_linear
{
    public static void main(String[] args)
    {
        int arr[]={3,0,2,0,4};
        int n=arr.length;
        Stack<Integer> s1= new Stack<>();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            while(!(s1.isEmpty())&&(arr[s1.peek()]<arr[i]))
            {
                int pop_height=arr[s1.peek()];
                s1.pop();
                if(s1.isEmpty())
                break;
                int d=i-s1.peek()-1;
            }

        }
    }
}