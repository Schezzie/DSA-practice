import java.util.*;
public class Rats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int total=r*unit;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int prefixSum[]=new int[n+1];
        prefixSum[0]=0;
        for(int i=1;i<=n;i++)
        prefixSum[i]=prefixSum[i-1]+a[i-1];
        if(prefixSum[n]<total)
        {
            System.out.println(0);
            return;
        }
        int l=1;
        int h=n;
        int m=1;
        while(l<h)
        {
            m=(l+h)/2;
            if(prefixSum[m]<total)
            {
                l=m+1;
            }
            if(prefixSum[m]==total)
            {
                break;
            }
            if(prefixSum[m]>total)
            h=m-1;
        }
        System.out.println(Arrays.toString(prefixSum));
        if(prefixSum[m]==total)
        System.out.println(m+1);
        else
        System.out.println(m+2);


    }
    
}
