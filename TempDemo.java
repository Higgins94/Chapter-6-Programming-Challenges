import java.util.Scanner; 
/**
   The TempDemo class makes an instance of the Temperature class 
   repeats for the user to enter multiple Fahrenheit temperatures 
*/ 
public class TempDemo { 
   public static void main(String[] args) { 
   
      double temp, again = 1; 
      
      Scanner scan = new Scanner(System.in); 
   
      while (again == 1) { 
         System.out.print("\nEnter Fahrenheit temperature: "); 
         temp = scan.nextDouble(); 
   
         Temperature temp1 = new Temperature(temp); 
      
         System.out.printf("\nCelsius: %,.2f\nKelvin: %,.2f" ,temp1.getCelsius() ,temp1.getKelvin()); 
         System.out.print("\n\n1. Again\n2. Quit");
         System.out.print("\n(1 or 2): ");  
         again = scan.nextDouble(); 
      } 
      System.out.print("Adios");    
   } 
} 
   