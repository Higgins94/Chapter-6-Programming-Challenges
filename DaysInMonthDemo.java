import java.util.Scanner; 
/**
   The DaysInMonthDemo class prompts the user to enter a month then 
   creates a object to displays the getNumOfDays field from the DaysInMonth class
*/ 
public class DaysInMonthDemo { 
   public static void main(String[] args) { 
   
      int userMonth, userYear; 
   
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("1. January\n2. Feburuary\netc.");
      System.out.print("\n\nYour choice (1-12): ");  
      userMonth  = scan.nextInt();
      if (userMonth < 1 || userMonth > 12) { 
         System.out.println("\nInvalid Input"); 
         System.out.print("\n\n1. January\n2. Feburuary\netc.");
         System.out.print("\n\nYour choice (1-12): ");
         userMonth  = scan.nextInt();
      }  
       
      System.out.print("\nEnter the year: ");
      userYear = scan.nextInt(); 
      if (userYear <= 0) { 
         System.out.println("\nInvalid Input");
         System.out.print("\n\nEnter the year: ");
         userYear = scan.nextInt();
      } 
       
      DaysInMonth user1 = new DaysInMonth(userMonth, userYear);
      
      System.out.printf("\n%d days" ,user1.getNumOfDays()); 
   } 
}  