import java.util.Scanner; 
/**
   The PayRollDemo class prompts the user for information to create an object  
   from Payroll class then displays field. 
*/ 
public class PayRollDemo { 
   public static void main(String[] args) { 
      String name; 
      int id; 
      double hourPay; 
      int numHours; 
      double grossPay; 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("\nEnter the name of the employee: ");
      name = scan.nextLine(); 
      
      System.out.print("\nEnter the employee's ID number: "); 
      id = scan.nextInt(); 
      
      System.out.print("\nEnter the employee's hourly pay rate: "); 
      hourPay = scan.nextDouble(); 
      
      System.out.print("\nEnter the number of hours the employee has worked: "); 
      numHours = scan.nextInt();
      
      Payroll person1 = new Payroll(name, id, hourPay, numHours); 
      
      System.out.printf("\nEmployee name: %s - Employee ID: %d - Hour Pay Rate: %,.2f - Hours Worked: %d" ,person1.getName(), person1.getID() ,person1.getHourPay(), person1.getNumHours()); 
      System.out.printf("\nThe employees gross pay is %,.2f " ,person1.getGrossPay()); 
   }
}  