import java.util.Random; 
/**
   The Die class simulates a die for D&D 
*/ 

public class Die { 
   
   private int sides; 
   private int value; 
   
   /**
      Constructer performs an initial roll of die
      @perma numSides The number of sides for this die. 
   */ 
   
   public Die(int numSides) { 
      sides = numSides; 
      roll(); 
   } 
   
   /** 
      The roll method simulates the rolling 
      of the die. 
   */ 
   
   public void roll() { 
      Random toss = new Random(); 
      value = toss.nextInt(sides) + 1; 
   } 
   
   /** 
      GetSides method 
      @return The number of sides for this die. 
   */
   
   public int getSides() { 
      return sides; 
   }
   
   /** 
      GetValue method
      @return The value of the die. 
   */ 
   
   public int getValue() { 
      return value; 
   } 
} 