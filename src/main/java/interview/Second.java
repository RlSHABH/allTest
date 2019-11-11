package interview;

public class Second {
  public static void main(String[] args)
  {
    String s1=new String("abc");
    String s2=new String("abc");
    String s3="abc";
    String s4="abc";
    System.out.println(s1==s2);//F
    System.out.println(s1.equals(s2));//T
    System.out.println(s2==s3);//F
    System.out.println(s3==s4); //T
    System.out.println(s3.equals(s4));//T
    System.out.println(s1.equals(s3));//T


  }
}
