package com.demo.corejava.designPattern;

import java.util.Arrays;

public class ReverseAnArray {

  public static void main(String[] args) {

    System.out.println(Arrays.toString(reverseArray(new int[] {1, 2, 3, 4, 5},new int[5],0)));
  }

  private static int[] reverseArray(int[] arr,int[] newArr,int n) {

    if(n>=arr.length)
    {
      return newArr;
    }
    newArr= reverseArray(arr,newArr,n+1);
    newArr[n]=arr[arr.length-n-1];
    return newArr;
  }
}
