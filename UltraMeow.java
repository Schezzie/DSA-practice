import java.util.*;
public class UltraMeow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=i+1;
        int sum=0;
        for(int i=0;i<(1<<n);i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))>0)
                {
                    list.add(arr[j]);
                }
            }
            sum+=MEX(list,list.size());
        }
        System.out.println(sum);
    }
    }
    static int MEX(ArrayList<Integer> list,int k)
    {
        int sum=0;
        int c=0;
        for(int i=1;c<k;i++)
        {
            if(!list.contains(i))
            {
                c++;
                sum+=i;
            }
        }
        return sum;
    }
}