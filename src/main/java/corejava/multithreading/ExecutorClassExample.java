package corejava.multithreading;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorClassExample {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService= Executors.newSingleThreadExecutor();
   Future f =executorService. submit(()->{
      return "callable called";
    });
   f.get();
    CompletableFuture completableFuture=new CompletableFuture();
    ExecutorClassExample e=new ExecutorClassExample();
   e.callAsyncMethods();

  }

  private  void callAsyncMethods() throws ExecutionException, InterruptedException {
   System.out.println(CompletableFuture.runAsync(()-> System.out.println("running Aysnc")).thenApply(name->name+"test").get());

      CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(
        ()->{
          System.out.println( "Supply Aysnc");
        return "abc";}).thenApply(name-> name+"test");
   System.out.println(completableFuture.get());

    System.out.println("Retrieving weight.");
    CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return 65.0;
    });

    System.out.println("Retrieving height.");
    CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return 177.8;
    });

    System.out.println("Calculating BMI.");
    CompletableFuture<Double> combinedFuture = weightInKgFuture
        .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
          System.out.println(""+heightInCm+""+weightInKg);
          Double heightInMeter = heightInCm/100;
          return weightInKg/(heightInMeter*heightInMeter);
        });

    System.out.println("Your BMI is - " + combinedFuture.get());


  }
}
