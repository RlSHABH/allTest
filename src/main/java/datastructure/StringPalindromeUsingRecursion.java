package datastructure;

public class StringPalindromeUsingRecursion {

    public static void main(String[] args)
    {
        System.out.println(checkIfPalindromeUsingRecursion(""));
    }

    static boolean checkIfPalindromeUsingRecursion(String a)
    {
/*
       // without Recursion
        for(int i=0;i<a.length()/2;i++)
        {
            if(!(a.charAt(i)==a.charAt(a.length()-i-1)))
            {
                return false;

            }
        }
            return true;*/

        // with recursion
        if(a.length()==1||a.length()==0)
        {
            return true;
        }
        if (a.charAt(0) != a.charAt(a.length() - 1)) {
            return false;
        }
        return checkIfPalindromeUsingRecursion(a.substring(1, a.length() - 1));



    }
}
