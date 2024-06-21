/**
   The car class hold information about a car
*/
public class Car { 

   private int yearModel;
   private String make; 
   private int speed; 
   
   /**
   Constructor to set values to approiate fields.  
   */
   
   public Car(int carYearModel, String carMake, int carSpeed) { 
      yearModel = carYearModel;  
      make = carMake;  
      speed = carSpeed; 
   } 
   
   /**
      The getYearModel method returns yearModel. 
      @return yearModel The year the model of the car is from. 
   */ 
   
   public int getYearModel() {
      return yearModel; 
   }
   
    /**
      The getMake methods returns make.
      @return make The make of the car.    
   */ 
   
   public String getMake() {
      return make; 
   }
   
      /**
      The getYearModel method returns yearModel. 
      @return speed The value for the car's speed.  
   */ 
   
   public int getSpeed() {
      return speed; 
   }
   
   /**
      The accelerate method adds 5 to the speed field each time it is called. 
   */
   
   public void accelerate() { 
      speed += 5; 
   } 
   
   /**
      The brake method substracts 5 to the speed field each time it is called. 
   */
   public void brake() { 
      speed -= 5; 
   } 
}
   
   
   
   
    
   
   