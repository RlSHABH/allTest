package corejava.designPattern;


/*An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
Use:
When an outside component provides captivating functionality that we'd like to reuse,
 but it's incompatible with our current application. A suitable Adapter can be developed to make them compatible
  with each other
   When our application is not compatible with the interface that our
   client is expecting
   When we want to reuse legacy code in our application without making any
    modification in the original code

 * */
public class AdaptorDesignPattern {

  public static void main(String[] args)
  {
    Movable bugattiVeyron = new BugattiVeyron();
    System.out.println(bugattiVeyron.getSpeed());

    Movable bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
    System.out.println(bugattiVeyronAdapter.getSpeed());

  }
}

// original interface
 interface Movable {
  // returns speed in MPH
  double getSpeed();
}

// original implementing car
 class BugattiVeyron implements Movable {

  @Override
  public double getSpeed() {
    return 268;
  }
}

 class MovableAdapterImpl implements Movable {
  private Movable luxuryCars;

  // standard constructors
   MovableAdapterImpl(Movable luxuryCars)
   {
     this.luxuryCars=luxuryCars;
   }
  @Override
  public double getSpeed() {
    return convertMPHtoKMPH(luxuryCars.getSpeed());
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }
}