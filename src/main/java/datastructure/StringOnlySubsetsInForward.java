package datastructure;
/*

abc
        ab
        ac
        a
        bc
        b
        c
*/


public class StringOnlySubsetsInForward {
    public static void main(String[] args)
    {
        String a="xyz";
        String ans=a.charAt(0)+"";
        subsets(a,ans);
    }
    static void subsets(String a, String ans)
    {
        if(a.length()==1)
        {
           System.out.println(ans+a);
        }
            char ch=a.charAt(0);
            String s=a.substring(1,a.length());
            subsets(a,ans+ch);
            System.out.println(ans+ch);
    }
}
