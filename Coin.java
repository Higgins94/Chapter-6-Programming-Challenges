import java.util.Random;
/**
   The Coin class simulates flipping a coin
*/ 

public class Coin { 
   
   private int num , num2; 
   private String side; 
   
   /**
      No arg Constructor 
   */
   public Coin () { 
      Random rand = new Random(); 
      num = rand.nextInt(2) + 1;
      sideUp(num);  
   } 
   /**
      The sideUp method determines if coin is heads or tail
      @perma number The value used to determine if heads or tail
   */ 
   
   public void sideUp(int number) {
      if (number == 1)  
         side = "Heads"; 
      else 
         side = "Tails"; 
   } 
   
   /**
      The toss method randomly chooses heads or tails for the coin
      
   */
   
   public void toss() { 
      Random rand2 = new Random();
      num2 = rand2.nextInt(2) + 1; 
      sideUp(num2); 
   } 
   
   /**
      The getSideUp method returns side
      @return side The Heads or Tail value
   */ 
   public String getSideUp() { 
      return side; 
   } 
} 
       
      