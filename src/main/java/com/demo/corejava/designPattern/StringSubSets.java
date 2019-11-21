package com.demo.corejava.designPattern;

public class StringSubSets {

  public static void main(String[] args)
  {
    String abs="";
    printSubSets("dddd",abs);
  }

  private static void printSubSets(String str,String abs) {

    if(str.length()<=1)
    {
      System.out.println(abs+str);
      return;
    }
    char ch=str.charAt(0);
    boolean isDuplicate=false;
    for(int i=1;i<str.length();i++) {
      if(str.charAt(i)==ch)
      {
        isDuplicate=true;
      }
    }
    if(!isDuplicate) {
      String s = str.substring(1, str.length());


      printSubSets(s, abs + ch);
      printSubSets(s, abs);
    }
    System.out.println(abs + ch);
  }
}
