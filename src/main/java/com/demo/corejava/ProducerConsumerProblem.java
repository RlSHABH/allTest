package com.demo.corejava;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProblem {
  public static void main(String args[]) throws InterruptedException
  {
    BlockingQueue<Integer> blockingQueue=new LinkedBlockingQueue<>(1);
    Thread producer= new Thread(new Producer(blockingQueue),"PRODUCER");
    Thread consumer= new Thread(new Consumer(blockingQueue),"CONSUMER");
    producer.start();
    consumer.start();

  }
}

class Producer implements Runnable {

  private BlockingQueue<Integer> blockingQueue;

  Producer(BlockingQueue<Integer> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {

    while (true) {
      Random random = new Random();
      try {
        System.out.println("produced value");
        blockingQueue.put(random.nextInt(100));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

  class Consumer implements Runnable
  {

    private BlockingQueue blockingQueue;

    Consumer(BlockingQueue blockingQueue)
    {
     this.blockingQueue=blockingQueue;
    }
    public void run() {
      while (true) {
        try {
          System.out.println("consumed value" + blockingQueue.take());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }





