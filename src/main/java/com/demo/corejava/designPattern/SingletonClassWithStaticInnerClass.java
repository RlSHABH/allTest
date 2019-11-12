package designPattern;

public class SingletonClassWithStaticInnerClass {

private SingletonClassWithStaticInnerClass()
{

}
   private static class innerClass {
      private static   SingletonClassWithStaticInnerClass s=new SingletonClassWithStaticInnerClass();
    }

    public SingletonClassWithStaticInnerClass getSingletonInstance(){
    return innerClass.s;
    }
}
