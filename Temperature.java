/**
   The Temperature class hold a Fahrenheit temp field and 
   calculates the equivalent for Celsius and Kelivn temps 
*/
public class Temperature { 

   private double ftemp;
   private double ctemp; 
   private double ktemp; 
   
   /**
   Constructor to hold ftemp 
   @perma fahTemp Fahrenheit temperature 
   */  
   
   public Temperature (double fahTemp) { 
      ftemp = fahTemp; 
   } 
   
   /**
      The setFahrenheit method assigns value to ftemp 
      @perma fahTemp The Fahrenheit temperature 
   */ 
   
   public void setFahrenheit(double fahTemp) { 
      ftemp = fahTemp; 
  } 
  
  /** 
   The getFahrenheit method return ftemp 
   @return ftemp The Fahrenheit temperature 
  */ 
  
  public double getFahrenheit() { 
   return ftemp; 
  }
  
  /** 
   The getCelsius returns ctemp 
   @return ctemp The value for the Celsius temperature 
  */ 
  
  public double getCelsius() { 
  
   ctemp = 5.0/9.0 * (ftemp - 32.0); 
   return ctemp; 
  }
  
  /** 
   The getKelvin method returns ktemp 
   @return ktemp The value for the Kelvin temperature  
  */ 
  
  public double getKelvin() {    
   double ctemp = 5.0/9.0 * (ftemp - 32.0);
   ktemp = ctemp + 273.0;  
   return ktemp; 
  } 
}  
    
    
  