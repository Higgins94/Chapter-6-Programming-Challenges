import java.util.Scanner;
import javax.swing.JOptionPane;  
/**
   The SavingAccountDemo class creates an instance of the SavingAccount class
*/ 

public class SavingAccountDemo { 
   public static void main (String[] args) { 
      
      String sBalance, interestR, input; 
      int months;   
      
      Scanner scan = new Scanner(System.in); 
      
      sBalance = JOptionPane.showInputDialog("Enter the starting balance for the account");
      interestR = JOptionPane.showInputDialog("\nEnter the annual interest rate (Ex. 12, 6.5, etc)");  
      input = JOptionPane.showInputDialog ("\nEnter the number of months that have passed since the account was established"); 
      months = Integer.parseInt(input); 
      monthsLoop(interestR, sBalance, months);  
      
   } 
    /**
      The monthsLoop simulates deposits, withdraws, and monthly interest per month 
      for the object "account"
      @perma interestR The annual interest rate 
      @perma sBalance The starting balance of the account
      @perma months The number of months since the account has been established
    */
    
   public static void monthsLoop(String interestR, String sBalance, int months) { 
      
      SavingAccount account = new SavingAccount(interestR, sBalance); 
      Scanner scan = new Scanner(System.in); 
     
      double depositNum ,withdrawNum ,interest ,startBalance ,balance, balance2;
      startBalance = Double.parseDouble(sBalance); 
      double interestEarned = 0.0, withTotal = 0.0, depTotal = 0.0;
      interest = account.getMonthR(); 
      
      for(int i = 1; i <= months; i++) { 
         
         System.out.printf("\nEnter deposit amount for month %d: $" ,i);
         depositNum = scan.nextDouble();
         depTotal += depositNum; 
         account.deposit(depositNum);
          
         System.out.printf("\nEnter withdraw amount for month %d: $" ,i);
         withdrawNum = scan.nextDouble();
         withTotal += withdrawNum;  
         account.withdraw(withdrawNum); 
         
         ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         // I decided to calculate total interest earned with local varaibles, should have made another method in the         //
         // SavingAccount class. I set interest rate with the local varaible "interest" and then I just do the calculation by // 
         // by reassigning the current account balance to varaible "balance2" to be added to running total to "interestEarned"// 
         ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
         account.addMonthlyR(); 
         balance2 = account.getBalance(); 
         interestEarned += (balance2 * interest);  
      }
      
      balance = account.getBalance(); 
      displayData(depTotal, withTotal, interestEarned, startBalance, balance);  
   } 
   
   /**
      The displayData method displays information regarding the SavingAccount object "account" 
      after the monthsLoop method has iterated
      @perma depositTotal The total value for all deposits that occured in the monthsLoop method
      @perma withTotal The total value for all withdraws that occured in the monthsLoop method
      @perma interestTotal The total value for all interest earned that occured in the monthsLoop method
      @perma sBalance The starting balance of the account
      @perma balance The ending balance of the account
   */ 
   
   public static void displayData(double depTotal, double withTotal, double interestEarned, 
                                 double startBalance, double balance) {                         
      System.out.print("\n*********************************"); 
      System.out.printf("\nDeposit Total: $%,.2f" ,depTotal); 
      System.out.printf("\nWithdraw Total: $%,.2f" ,withTotal); 
      System.out.printf("\nInterest Earned: $%,.2f" ,interestEarned); 
      System.out.printf("\nStarting Balance: $%,.2f" ,startBalance); 
      System.out.printf("\nEnding Balance: $%,.2f" ,balance);
      System.out.print("\n*********************************");  
   } 
}         
      
      