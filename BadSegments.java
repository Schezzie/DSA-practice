import java.util.*;
public class BadSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int count=0;
            int dp[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                int prod=1;
                for(int j=i;j<n;j++)
                {
                    prod=prod*arr[j];
                    dp[i][j]=prod;
                    if(prod==x)
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
