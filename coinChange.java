import java.util.*;
public class coinChange
{
    static int changeCount(int n,int arr[])
    {
        if(n==0)
        return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(n-arr[i]>=0){
            int subAns=changeCount(n-arr[i],arr);
            if(subAns+1<ans&&subAns!=Integer.MAX_VALUE)
            ans=subAns+1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int target=18;
        int arr[]={1,5,7};
        System.out.println(changeCount(target,arr));
    }
}