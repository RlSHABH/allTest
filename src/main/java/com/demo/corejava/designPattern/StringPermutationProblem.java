package com.demo.corejava.designPattern;

public class StringPermutationProblem {



  public static void main(String[] args) {


    String in = "xyxx";
    String res="";
    int noOfSubsets=fact(in.length());
    String arr[]=new String[noOfSubsets];
    permutation(in,res);
  }

  private static void permutation(String in,String res) {

    for (int i = 0; i < in.length(); i++) {
        if(in.length()==1)
        {
          System.out.println(in+res);

        }
      char ch = in.charAt(i);
        String stringAfterIndex=in.substring(i + 1);
        boolean a=true;
      String s = in.substring(0, i) + in.substring(i + 1);
      for(int j=0;j<stringAfterIndex.length();j++)
      {
        if(stringAfterIndex.charAt(j)==ch)
        {
          a=false;

        }
      }
      if(a) {
        permutation(s, ch + res);
      }

    }
  }

  private static int fact(int n)
  {
    if(n==1)return 1;
    return fact(n-1)*n;
  }

}
