/**
   The SavingAccount simulates a savings account
*/ 
public class SavingAccount { 

   private double interestR;//<--- Annual Interest Rate // 
   private double balance;
   private double monthlyR; 
   
   /**
      No arg constructor 
   */ 
   
   public SavingAccount() { 
      interestR = 0.0; 
      balance = 0.0; 
      setMonthR(interestR); 
   } 
   
   /**
      Double constructor 
      @perma intR The value for interest rate
      @perma bal The value for the balance 
   */ 
   
   public SavingAccount(double intR, double bal) { 
      interestR = intR; 
      balance = bal;
      setMonthR(interestR);  
   } 
   
   /**
      Int constructor 
      @perma intR The value for the interst rate
      @perma bal The value for the balance 
   */ 
   
   public SavingAccount(int intR, int bal) { 
      interestR = intR; 
      balance = bal;
      setMonthR(interestR);  
   
   } 
   
   /**
      Constructor for String
      @perma intR The value for the interst rate
      @perma bal The value for the balance
   */ 
   
   public SavingAccount(String intR, String bal) { 
      interestR = Double.parseDouble(intR); 
      balance = Double.parseDouble(bal);
      setMonthR(interestR);  
   } 
   
   /**
      The withdraw method subtracts the withdraw value form the balance 
      @perma withdraw double value of withdraw
   */ 
   
   public void withdraw(double withdraw) { 
      balance -= withdraw; 
   } 

   /**
      The deposit method adds the value of the deposit to the balance field
      @perma deposit The double value of the deposit 
   */ 
   
   public void deposit(double deposit) { 
      balance += deposit; 
   } 
   
   /**
      The addMonthlyR method adds the monthly interest rate to the balance 
      The monthly interest rate is the interestR divided by 12
      Calls getMonthR method
   */ 
   
   public void addMonthlyR() {   
      balance += (balance * monthlyR); 
   }
   
   /**
      The setMonthR sets the rate for the monthly interest by dividing the annual rate by 12
      @perma interestR The annual interest rate
   */ 
   public void setMonthR( double interestR) { 
      monthlyR = (interestR / 100.0) / 12.0; 
   } 
   
   /**
      The getMonthR method returns the monthly rate
      @return monthlyR The monthly rate
   */ 
   
   public double getMonthR() { 
      return monthlyR; 
   } 
      
   
   /**
      The getBalance method returns balance 
      @return balance The value of the savings account balance
   */ 
   
   public double getBalance() { 
      return balance; 
   } 
}
   