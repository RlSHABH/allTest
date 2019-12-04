package com.demo.interview;

import java.util.Random;
import org.apache.commons.lang.math.RandomUtils;

public class RandomNoGenerator {

  public static void main(String[] args) {
    getRandomBetween(2, 9);
  }

  private static void getRandomBetween(int min, int max) {

    int maxLimit = 10;
    int r1=(int)(10.0*Math.random());
   System.out.println(r1);
    int result=0;
   if(r1>min) {
      result = ((r1 - min) % max) + min ;
   }
   else
   {
     result=(r1%max)+min;
   }
    System.out.println(result);
  }
}
