package com.demo.corejava.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumerProblem {

  private static BlockingQueue<Integer> blockingQueue=new PriorityBlockingQueue<Integer>() ;

  public static void main(String[] args)
  {

    Thread producer=new Thread(()->{
      int i=1;
      for(int j=0;j<10;j++) {
          try {
            blockingQueue.put(i++);
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

    });
    Thread consumer=new Thread(()->{
      for(int j=0;j<10;j++) {

        try {
          System.out.println(blockingQueue);
          System.out.println(blockingQueue.take());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    });
      producer.start();
    consumer.start();
  }



}
