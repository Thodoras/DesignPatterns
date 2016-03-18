public class Animal {
  
  private String sound;
  public Flys flyingType;
  
  public void setSound(String sound) {
    this.sound = sound;
  }
  
  public String getSound() {
    return this.sound;
  }
  
  public String tryToFly() {
    return flyingType.fly();
  }
  
  public void setFlyingAbility(Flys flys) {
    flyingType = flys;
  }
}