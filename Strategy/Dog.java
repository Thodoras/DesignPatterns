public class Dog extends Animal {
  
  public void digHole() {
    
    System.out.println("Hle dug!");
    
  }
  
  public Dog() {
    super();
    setSound("Bark");
    flyingType = new ItNotFlys();
  }
  
}