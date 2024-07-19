import java.util.*;
public class binaryStrings {

    static ArrayList<String> generate(int n)
    {
        ArrayList<String> list=  new ArrayList<>();
        if(n==0)
        {
        list.add("");
        return list;
        }
        if(n==1)
        {
        list.add("1");
        list.add("0");
        return list;
        }
        list = generate(n-1);
        ArrayList<String> list1=new ArrayList<String>();
        for(String str: list)
        {
            list1.add(str+"0");
            if(str.charAt(str.length()-1)=='0')
            {
                String s1 =str+"1";
                list1.add(s1);
            }

        }
        return list1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list = generate(n);
        Collections.sort(list);
        System.out.println(list);
    }
}
