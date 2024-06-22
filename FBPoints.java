/**
   The 
*/ 
public class FBPoints { 

   String bool; 
   private double temp; 
   
   /**
      No args constructor 
   */
   public FBPoints() { 
      temp = 0.0;
   }
   
   /**
      Int constructor
      @perma temperature The value for the temperature 
   */
   public FBPoints(int temperature) { 
      temp = temperature;
   } 
   
   /**
      String constructor
      @perma temperature The value for the temperature 
   */ 
   
   public FBPoints (String temperature) { 
      temp = Double.parseDouble(temperature); 
   } 
   
   /**
      Double constructor
      @perma temperature The value for the temperature 
   */ 
   
   public FBPoints(double temperature) { 
      temp = temperature; 
   } 
   
   /**
      The isEthylFreezing method determines if temp is in the range of the 
      freezing point of ethyl alcohol
      @perma temperature The value for the temperature 
      @return bool The boolean value 
   */ 
   
   public String isEthylFreezing() {
      if (temp == -173 || temp < -173) {   
         bool = "TRUE";
         return bool;  
      } else {
         bool = "FALSE";
         return bool;
      } 
   } 
   
   /**
      The isEthylBoiling ethod determines if temp is in the range of the 
      boiling point of ethyl alcohol
      @perma temperature The value for the temperature 
      @return bool The boolean value 
   */ 
    
    public String isEthylBoiling() {
      if (temp == 173 || temp > 173) { 
         bool = "TRUE";
         return bool;  
      } else { 
         bool = "FALSE";
         return bool;
      }
    } 
    
    /**
      The isOxygenFreezing method determines if temp is in the range of the 
      freezing point of oxygen
      @perma temperature The value for the temperature 
      @return bool The boolean value 
   */ 
   
    public String isOxygenFreezing() { 
      if (temp == -362 || temp < -362) {   
         bool = "TRUE";
         return bool;  
      } else {
         bool = "FALSE";
         return bool; 
      }  
    } 
    
    /**
      The isOxygenBoiling method determines if temp is in the range of the 
      boiling point of oxygen
      @perma temperature The value for the temperature 
      @return bool The boolean value 
   */ 
   
    public String isOxygenBoiling() { 
      if (temp == -306 || temp > -306) {  
         bool = "TRUE"; 
         return bool;
      } else {  
         bool = "FALSE";
         return bool; 
      }    
    } 
    
    /**
      The isWaterFreezing method determines if the temperature is within the 
      freezing range of water
      @perma temperature The value for the temperature 
      @return bool The boolean value
    */ 
    
    public String isWaterFreezing() {
      if (temp == 32 || temp < 32)  { 
         bool = "TRUE";
         return bool; 
      } else {
         bool = "FALSE"; 
         return bool;  
      }
    }
    
     /**
      The isWaterBoiling method determines if the temperature is within the 
      boiling range of water
      @perma temperature The value for the temperature 
      @return bool The boolean value
    */ 
    
    public String isWaterBoiling() {
         if (temp == 212 || temp > 212) {   
         bool = "TRUE";
         return bool;  
      } else { 
         bool = "FALSE";
         return bool;  
     }
   }  
}

    
    

    

    
        
  