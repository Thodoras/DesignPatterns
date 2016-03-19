public class StockObserver implements Observer {
  
  private double ibmPrice;
  private double aaplPrice;
  private double googPrice;
  
  private static int observerIDTracker = 0;
  
  private int observerID;
  
  private Subject stockGrabber;
  
  public StockObserver(Subject stockGrabber) {
    this.stockGrabber = stockGrabber;
    this.observerID = ++observerIDTracker;
    System.out.println("New Observer " + this.observerID);
    this.stockGrabber.register(this);
  }
  
  public void update(double ibmPrice, double aaplPrice, double googPrice) {
    this.ibmPrice = ibmPrice;
    this.aaplPrice = aaplPrice;
    this.googPrice = googPrice;
    
    printPrices();
  }
  
  public void printPrices() {
    
    System.out.println(observerID + "\nIBM: " + ibmPrice + "\nApple: " + aaplPrice + "\nGoogle " + googPrice);
  }
}