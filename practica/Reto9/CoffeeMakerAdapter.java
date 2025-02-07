public class CoffeeMakerAdapter implements Connectable {

     private CoffeeMaker coffeeMaker;
 
     public CoffeeMakerAdapter(CoffeeMaker coffeeMaker) {
         this.coffeeMaker = coffeeMaker;
     }
 
     @Override
     public void turnOn() {
         coffeeMaker.on();
     }
 
     @Override
     public void turnOff() {
         coffeeMaker.off();
     }
 
     @Override
     public boolean isOn() {
         return !coffeeMaker.isOff();
     }
 }
 
 public class TurnOnDevices {
 
     public static void main(String[] args) {
         turnOnDevice(new Lamp());
         turnOnDevice(new Computer());
         turnOnDevice(new CoffeeMakerAdapter(new CoffeeMaker()));
     }
 
     private static void turnOnDevice(Connectable device) {
         device.turnOn();
         System.out.println(device.isOn());
     }
 }