package com.demo.corejava.multithreading;

public class YieldExample {

  public static void main(String[] args) throws InterruptedException {
    Thread t=new Thread(()->{System.out.println(Thread.currentThread().getName());});
    t.start();
    for(int i=0;i<10;i++)
    {


      t.join();
        System.out.println(i+"");
        Thread.yield();

    }

  }


}
