package interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *
 *hibernate bean lifecycle
 * (Transient ,Persistence,Detached,Removed)
 *remove duplicates using spring stream
 *
 *
*/
public class first {

  public static void main(String[] args)
  {
    String a="aaacgfhghjkl";
    StringBuffer ab=new StringBuffer();
   a.chars().distinct().forEach(x->ab.append((char)x));
System.out.println(ab.toString());

  }

}
