import java.util.ArrayList;

public class StockGrabber implements Subject {
  
  private ArrayList<Observer> observers;
  private double ibmPrice;
  private double aaplPrice;
  private double googPrice;
  
  public StockGrabber() {
    observers = new ArrayList<Observer>();
  }
  
  public void register(Observer observer) {
    observers.add(observer);
  }
  
  public void unregister(Observer observer) {
    int observerIndex = observers.indexOf(observer);
    System.out.println("Observer " + (observerIndex + 1) + " deleted");
    observers.remove(observerIndex);
  }
  
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(ibmPrice, aaplPrice, googPrice);
    }
  }
  
  public void setIBMPrice(double newIBMPrice) {
    this.ibmPrice = newIBMPrice;
    notifyObservers();
  }
  
  public void setApplePrice(double newApplePrice) {
    this.aaplPrice = newApplePrice;
    notifyObservers();
  }
  
  public void setGooglePrice(double newGooglePrice) {
    this.googPrice = newGooglePrice;
    notifyObservers();
  }
}