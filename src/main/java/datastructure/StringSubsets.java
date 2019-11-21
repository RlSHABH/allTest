package datastructure;

public class StringSubsets {

    public static void main(String[] args)
    {
        String str="xyx";
        String ans="";
        stringsubSets(str,ans);
    }

    static void stringsubSets(String str,String ans)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1,str.length());
            boolean call=true;
            for(int j=0;j<str.substring(i+1,str.length()).length();j++)
            {
                if(s.charAt(j)==ch)
                {
                    call=false;
                    break;

                }
            }
          if  (call) {
              stringsubSets(s, ch + ans);
              System.out.println(ch + ans);
          }
        }
    }
}
