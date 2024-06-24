public class CoinDemo { 
   public static void main(String[] args) { 
      
      Coin coin1 = new Coin();
      int headCount = 0, tailCount = 0;
      String toss;   
      
      toss = coin1.getSideUp();
      System.out.println(toss);
         if (toss.equalsIgnoreCase("HEADS")) 
            headCount++; 
         else 
            tailCount++; 
      for (int i = 1; i <= 20; i++) { 
         coin1.toss(); 
         toss = coin1.getSideUp(); 
         System.out.printf("\n%s" ,toss); 
         if (toss.equalsIgnoreCase("HEADS"))
            headCount++; 
         else 
            tailCount++; 
      } 
      
      System.out.printf("\n\nTotal Heads: %d" ,headCount);
      System.out.printf("\n\nTotal Tails: %d" ,tailCount);  
    
   }
}