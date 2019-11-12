package com.demo.corejava.memory;

public class MemoryRepresentation {

    public static void main(String[] args) { // Line 1
      int i=1; // Line 2
      Object obj = new Object(); // Line 3
      MemoryRepresentation mem = new MemoryRepresentation(); // Line 4
      mem.foo(obj); // Line 5
      System.out.println(obj);
    } // Line 9

    private void foo(Object param) { // Line 6
    //  String str = param.toString(); //// Line 7
      System.out.println(param);
    } // Line 8

  }


