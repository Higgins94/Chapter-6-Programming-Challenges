/**
   The CarDemo class creates a car objects and calls the accelerate and 
   brake method five times. 
*/
public class CarDemo { 
   public static void main(String [] args) { 
      
      int make = 2024; 
      String model = "McLAREN ARTURA SPIDER";
      int speed = 0; 
      Car car = new Car(make, model, speed); 
      
      for (int i = 1; i <= 5; i++) {
         car.accelerate(); 
         System.out.printf("\nCurret speed of %s %s is %d" ,car.getYearModel(), car.getMake(), car.getSpeed()); 
      } 
       for (int i = 1; i <= 5; i++) {
         car.brake(); 
         System.out.printf("\nCurret speed of %s %s is %d" ,car.getYearModel(), car.getMake(), car.getSpeed()); 
      } 
   }
}

      
            