import java.util.*;
class cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        if(s.length==0)
        return 0;
        int l=0;
        int r=0;
        int m=s.length;
        while(l<m &&r<g.length)
        {
            if(g[r]<=s[l])
            r=r+1;
            l=l+1;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}