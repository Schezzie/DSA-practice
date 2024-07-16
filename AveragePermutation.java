import java.util.*;
public class AveragePermutation
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T=sc.nextInt();
        while(T>0)
        {
            T--;
            solution();
        }
        return;
    }
    static void solution()
    {
        int N=sc.nextInt();
        if(N==3)
        {
            System.out.print("1 2 3");
            return;
        }
        System.out.print((N-1)+" "+(N-3)+" ");
        for(int i=1;i<=N-4;i++)
        System.out.print(i+" ");
        System.out.print((N-2)+" "+(N));
        return;
    }
}