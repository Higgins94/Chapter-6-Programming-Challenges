import java.util.Scanner; 

public class ChoHan { 
   public static void main (String[] args) { 
      final int MAX_ROUNDS = 5; 
      String player1Name; 
      String player2Name; 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("\nEnter The First Player's Name: ");
      player1Name = scan.nextLine(); 
      System.out.print("\nEnter The Second Player's Name: "); 
      player2Name = scan.nextLine(); 
      
      Dealer dealer = new Dealer(); 
      Player player1 = new Player(player1Name); 
      Player player2 = new Player(player2Name); 
      
      for (int i = 1; i <= MAX_ROUNDS; i++) { 
         System.out.print("\n-------------------------------------"); 
         System.out.printf("\nNow Starting Round %d" ,i); 
         
         dealer.rollDice(); 
         player1.makeGuess(); 
         player2.makeGuess(); 
         
         roundResults(dealer, player1, player2); 
      }
      
      displayGrandWinner(player1, player2); 
   } 
   
/**
   The roundResults method will determine the winner of the round 
   @perma dealer Dealer object 
   @perma player1 Player1 object 
   @perma player2 Player2 object
*/ 

   public static void roundResults(Dealer dealer, Player player1, Player player2) { 
      System.out.printf("\nThe dealer rolled %d and %d\n" ,dealer.getDie1Value(), dealer.getDie2Value()); 
      System.out.printf("\nResult: %s" ,dealer.getChoOrHan()); 
      checkGuess(player1, dealer); 
      checkGuess(player2, dealer); 
   }
   
/**
   The checkGuess method checks a player's guess against 
   the dealer's results 
   @parma player The Player object
   @param dealer The Dealer object
*/   

   public static void checkGuess(Player player, Dealer dealer) { 
      final int POINTS_WON = 1; 
      String guess = player.getGuess(); 
      String choHanResult = dealer.getChoOrHan(); 
      
      System.out.printf("\nThe player %s guessed %s\n" ,player.getName(), player.getGuess()); 
      if (guess.equalsIgnoreCase(choHanResult)) { 
         player.addPoints(POINTS_WON); 
         System.out.printf("\nAwarding %d points to %s" ,POINTS_WON ,player.getName()); 
      }
   } 
   
/**
   The displayGrandWinner method displays the winner of the game 
   @perma player1 Player 1
   @perma player2 Player 2
  
*/  

   public static void displayGrandWinner(Player player1, Player player2) { 
      System.out.print("\n--------------------------------------------"); 
      System.out.print("\nGame over. Results: "); 
      System.out.printf("\n%s: %d points" ,player1.getName(), player1.getPoints()); 
      System.out.printf("\n%s: %d points" ,player2.getName(), player2.getPoints()); 
      
      if (player1.getPoints() > player2.getPoints()) 
         System.out.println(player1.getName() + " is the grand winner!"); 
      else if (player1.getPoints() < player2.getPoints()) 
         System.out.println(player2.getName() + " is the grand winner!");
      else 
         System.out.println("Both players tied!"); 
    } 
}  
         
        
  