import java.util.Random; 
/** 
   Player class for Cho-Han game 
*/ 
public class Player { 

   private String name; 
   private String guess; 
   private int points; 
   
/**
   Constructor 
   @perma playerName The name of the player 
*/ 

   public Player(String playerName) { 
      name = playerName; 
      guess = ""; 
      points = 0; 
   } 
   
/**
The makeGuess method causes the player to guess Cho or Han
*/

   public void makeGuess() { 
      Random r = new Random(); 
      int guessNumber= r.nextInt(2) + 1; 
      if (guessNumber == 1) { 
         guess = "Han"; 
      } else 
         guess = "Cho"; 
   } 
  
/** 
   The addPoints method keeps track of points 
*/ 

   public void addPoints(int newPoints) { 
      points += newPoints; 
   } 
 
/**
   The getName method returns the player's name. 
   @return The value of the name field
*/

   public String getName() { 
      return name; 
   } 
   
/**
   The getGuess method returns the player's guess. 
   @retur The value for the guess field
*/ 

public String getGuess() { 
   return guess; 
} 

/**
The getPoints method 
@return points The value for the point field 
*/

   public int getPoints() { 
      return points; 
   } 
   
} 