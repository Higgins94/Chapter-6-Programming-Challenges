import javax.swing.JOptionPane; 
/**
   The FBPointsDemo class creates an object and returs several boolean values 
   from the FBPoints class
*/ 

public class FBPointsDemo { 
   public static void main(String[] args) { 
      
      String input;
      
      input = JOptionPane.showInputDialog("Enter Temperature"); 
      
      FBPoints temp = new FBPoints(input); 
      
      input = temp.isEthylFreezing(); 
      if (input.equals("TRUE"))
         System.out.print("\nEthyl Alcohol will freeze at this temperature");
      input = temp.isEthylBoiling(); 
      if (input.equals("TRUE")) 
         System.out.print("\nthyl Alcohol will boil at this temperature");
         
      input = temp.isOxygenFreezing(); 
      if (input.equals("TRUE")) 
         System.out.print("\nOxygen will freeze at this temperature");
      input = temp.isOxygenBoiling(); 
      if (input.equals("TRUE")) 
         System.out.print("\nOxygen will boil at this temperature");
         
     input = temp.isWaterFreezing();
     if (input.equals("TRUE")) 
         System.out.print("\nWater will freeze at this temperature");
     input = temp.isWaterBoiling();
     if (input.equals("TRUE"))
         System.out.print("\nWater will boil at this temperature");
   }
} 
         
       
       
        
   