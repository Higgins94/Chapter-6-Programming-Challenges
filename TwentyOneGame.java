import java.util.Scanner; 
/**
   The TwentyOneGame simulates a game of 21 between a player and the computer
   dice are used instead of cards 
   dice are objects created with Die class
   I learned I definitly should have split up this program into different methods maybe even another class. 
   I got obstinate though and just finished it out
*/
public class TwentyOneGame {
   public static void main(String[] args) { 
      
      Die die1 = new Die(6); 
      Die die2 = new Die(6); 
      Scanner scan = new Scanner(System.in); 
      
      String input; 
      int playerTotal, compTotal, again = 1, newGame = 1, playerMoney, playerBet;    
      
      System.out.println("Starting New Game of Twenty-One (Dice Version)");
      System.out.println("$100 added"); 
      playerMoney = 100; 
      
      while (newGame == 1) {
         if (playerMoney < 1) 
            break;  
         playerTotal = 0; 
         compTotal = 0;
         playerBet = 0; 
         again = 1; 
         System.out.printf("\n\nTotal Cash: $%d" ,playerMoney); 
         System.out.print("\nEnter Bet: $ "); 
         playerBet = scan.nextInt();
         if (playerMoney < 5 && playerBet > 5) { 
            System.out.printf("Invalid Bet Amount\nDefault Bet of $%d Taken",playerMoney);
            playerBet = playerMoney;
         } else if (playerMoney < 5 && playerBet < 5) { 
            System.out.printf("Invalid Bet Amount\nDefault Bet of $%d Taken",playerMoney);
            playerBet = playerMoney;
         } else if (playerBet < 1 || playerMoney < playerBet) {
            System.out.print("Invalid Bet Amount\nDefault Bet of $5 Taken");
            System.out.print("\n-------------------------------");
            playerBet = 5;
         }  
         
         playerMoney -= playerBet; 
          
         while (again == 1) {  
            while (compTotal <= 17) { 
               die1.roll();
               die2.roll(); 
               compTotal += die1.getValue() + die2.getValue(); 
            } if (playerTotal < 22) { 
               die1.roll(); 
               die2.roll();
               System.out.printf("\nYou rolled %d and %d" ,die1.getValue() ,die2.getValue());
               System.out.print("\n*******************");  
               playerTotal += die1.getValue() + die2.getValue();
               if (playerTotal > 21) {
                  again = 0; 
               } else { 
                  System.out.printf("\nTotal: %d" ,playerTotal);
                  System.out.print("\n\nDo you want to roll the dice to accumlate points\n1. Yes\n2. No");
                  System.out.print("\n(1 or 2): ");  
                  again = scan.nextInt();
               } 
            }
            if (again < 1 && again > 2) { 
               System.out.print("\nInvalid Input");
               System.out.printf("\nCurret Total: %d" ,playerTotal);  
               System.out.print("\nDo you want to roll the dice to accumlate points\n1. Yes\n2. No?");
               System.out.print("\n(1 or 2): ");  
               again = scan.nextInt();
            }
            
         }
            
            if (playerTotal > 21 && compTotal < 22) {
               System.out.print("\nPlayer BUSTED"); 
               System.out.print("\n**************");
               System.out.printf("\nPlayer Total: %d" ,playerTotal);
               System.out.printf("\nHouse Total: %d" ,compTotal);
            } else if (playerTotal == 21 & compTotal != 21) { 
               System.out.print("\nPlayer Hits 21!");
               System.out.print("\n**************");
               System.out.printf("\nHouse Total: %d" ,compTotal);
               System.out.print("\n3x Bet Added"); 
               playerMoney += playerBet * 3;
            } else if (playerTotal < 21 && compTotal > 22) { 
               System.out.print("\nHouse Busted");
               System.out.print("\n**************");
               System.out.printf("\nPlayer Total: %d" ,playerTotal);
               System.out.printf("\nHouse Total: %d" ,compTotal);
               System.out.print("\n2x Bet Added"); 
               playerMoney += playerBet * 2;
            } else if (playerTotal > compTotal && playerTotal < 22 && compTotal < 22) {  
               System.out.print("\nPlayer WINS");
               System.out.print("\n**************"); 
               System.out.printf("\nPlayer Total: %d" ,playerTotal);
               System.out.printf("\nHouse Total: %d" ,compTotal);  
               System.out.print("\n2x Bet Added"); 
               playerMoney += playerBet * 2; 
            } else if (compTotal > playerTotal && compTotal < 22 && playerTotal < 22) { 
               System.out.print("\nThe House WINS");
               System.out.print("\n**************");
               System.out.printf("\nHouse Total: %d" ,compTotal);
               System.out.printf("\nPlayer Total: %d" ,playerTotal); 
            } else if (compTotal > 21 && playerTotal > 21) {
               System.out.print("\nDouble Bust"); 
               System.out.print("\n**************");
               System.out.printf("\nHouse Total: %d" ,compTotal);
               System.out.printf("\nPlayer Total: %d" ,playerTotal);  
               System.out.print("\nThe House Wins");
            } else if (playerTotal == compTotal) { 
               System.out.print("\nPlayer and House Tied");
               System.out.print("\n**************");
               System.out.printf("\nHouse Total: %d" ,compTotal);
               System.out.printf("\nPlayer Total: %d" ,playerTotal);
               System.out.print("\nHouse Takes All Ties");  
            } 
            if (playerMoney < 1) { 
               System.out.print("\n\nYou're Broke!"); 
               newGame = 0;
               break; 
            }
            newGame = 0;
            while (newGame < 1 || newGame > 2) { 
               System.out.print("\n\nAnother Round?"); 
               System.out.print("\n1. Yes\n2. No"); 
               System.out.print("\n(1 or 2): ");
               newGame = scan.nextInt();
               if (newGame == 1) { 
                  newGame = 1;
               } else if (newGame == 2) { 
                  break; 
               } else {
                  System.out.print("\nInvalid Input");
                  System.out.print("\nAnother Round?"); 
                  System.out.print("\n1. Yes\n2. No"); 
                  System.out.print("\n(1 or 2): ");
                  newGame = scan.nextInt();
               }
            }
         }           
      System.out.printf("\nTake Home: $%d" ,playerMoney); 
   }
          
}

       
         
         

