import java.util.*;
public class AccentureBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        int v1=str.charAt(0)-'0';
        for(int i=1;i<n;i=i+2)
        {
            char c=str.charAt(i);
            int v2=str.charAt(i+1)-'0';
            switch(c)
            {
            case 'A':
                v1=v1&v2;
                break;
            case 'B':
                v1=v1|v2;
                break;
            case 'C':
                v1=v1^v2;
                break;
            default:
                System.out.println("Invalid");
                break;
            }
        }
        System.out.println(v1);
    }
}
