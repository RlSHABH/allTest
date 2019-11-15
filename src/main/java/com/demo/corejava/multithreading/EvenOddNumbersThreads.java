package com.demo.corejava.multithreading;

public class EvenOddNumbersThreads {

private static int i=0;
  public static void main(String[] args) {
    EvenOddNumbersThreads e = new EvenOddNumbersThreads();
    Thread even = new Thread(e::printEvenNumber);
    Thread odd = new Thread(e::printOddNumber);
    even.start();
    odd.start();
  }

  private synchronized void printEvenNumber() {
    while(i<10) {
      try {
        if (!(i % 2 == 0)) {

          wait();
        }
        System.out.println(Thread.currentThread().getName()+ " "+i++);
        notify();
      } catch (InterruptedException e) {

      }
    }
  }

  private synchronized void printOddNumber() {
    while(i<10) {
      try {
        if (i % 2 == 0) {

          wait();
        }

        System.out.println(Thread.currentThread().getName()+ " "+i++);
        notify();
      } catch (InterruptedException e) {

      }
    }
  }
}
