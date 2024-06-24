/**
            Programming Challenge 14: Dice Game
   The HighLowGame uses the Dice class to create two dice objects to
   play a game of highest number wins with the user and the computer
*/ 
public class HighLowGame { 
   public static void main(String[] args) { 
   
      int userW = 0, compW = 0, ties = 0, roll1, roll2; 
      Die die1 = new Die(6); 
      Die die2 = new Die(6); 
   
      for (int i = 1; i <= 10; i++) {
         System.out.print("\n\n*****************");
         System.out.printf("\nRound %d" , i);
         System.out.print("\n---------"); 
         die1.roll();  
         roll1 = die1.getValue(); 
         System.out.printf("\nYou roll: %d" ,roll1); 
         die2.roll(); 
         roll2 = die2.getValue(); 
         System.out.printf("\nComputer roll: %d" ,roll2);

         if (roll1 > roll2)  
            userW++; 
         else if ( roll2 > roll1) 
            compW++; 
         else 
            ties++;
      }
      System.out.print("\n\n_________________");
      System.out.printf("\n\nUser Wins: %d" ,userW);
      System.out.printf("\nComputer Wins: %d" ,compW);
      System.out.printf("\nTies: %d" ,ties);
      System.out.print("\n_________________"); 
      
      if (userW > compW) 
         System.out.print("\n\n* User is the Grand Winner *"); 
      else if (compW > userW) 
         System.out.print("\n\n* Computer is the Grand Winner *"); 
      else {
         System.out.print("\n\nNo Grand Winner, TIME FOR SUDDEN DEATH"); 
         System.out.print("\n***************************************"); 
         System.out.print ("\nNEXT HIGHEST NUMBER WINS");
         System.out.print("\n-------------------------");
         while (userW == compW) {
            die1.roll();  
            roll1 = die1.getValue(); 
            System.out.printf("\nYou roll: %d" ,roll1); 
            die2.roll(); 
            roll2 = die2.getValue();
            System.out.printf("\nComputer roll: %d" ,roll2);
            if (roll1 > roll2)  
               userW++; 
            else if ( roll2 > roll1) 
               compW++; 
            else 
               ties++;
            if (userW > compW) {  
               System.out.print("\n_________________");
               System.out.print("\n\n* User is the Grand Winner *"); 
            } else if (compW > userW) {
               System.out.print("\n_________________"); 
               System.out.print("\n\n * Computer is the Grand Winner *");
            }
         }
      }

   }          
}         
      