/**
   Dealer Class for Cho-Han Game 
*/ 
public class Dealer { 

   private int die1Value; 
   private int die2Value; 

/**
   Constructor 
*/ 

   public Dealer() {
      die1Value = 0; 
      die2Value =0; 
   }
   
/**
   The rollsDice method rolls the dice and saves the values.
*/  

   public void rollDice() {
      final int SIDES = 6; 
      Die die1 = new Die(SIDES); 
      Die die2 = new Die(SIDES); 
      
      die1Value = die1.getValue(); 
      die2Value = die2.getValue(); 
   } 
   
/** 
   getChoOrHan method returns the results of the dice roll 
   @return Either "Cho" (even) or "Han" (odd)
*/    
   public String getChoOrHan() {  
      String result; 
      int sum; 
      sum = die1Value + die2Value;  
      
      if (sum % 2 == 0)  {
         result = "Cho"; 
         return result; 
      }  else {
         result = "Han"; 
         return result;
      } 
   } 
/**
   The getDie1Value method returns value for die1 
   @return The dieValue1 field
*/ 

   public int getDie1Value() {  
      return die1Value; 
   }  
   
/**
   The getDie2Value method returns value for die1 
   @return The dieValue2 field
*/ 

   public int getDie2Value() {  
      return die2Value; 
   }
} 
   
         