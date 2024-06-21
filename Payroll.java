/**
   The Payroll class holds information used to pay a employee. 
*/ 
public class Payroll { 

   private String name; 
   private int id;
   private double hourPay; 
   private int numHours; 
   private double grossPay; 
   
   public Payroll(String employeeName, int idNumber, double hourPayRate, int numHoursWorked) { 
      name = employeeName; 
      id = idNumber; 
      hourPay = hourPayRate; 
      numHours = numHoursWorked; 
      
   }
   
   /**
      The setName method assigns the name of the employee to the field
      @perma employeeName The name of the employee
   */
   
   public void setName(String employeeName) { 
      name = employeeName; 
   } 
   
   /** 
      The setID method assings the employee ID to the employee 
      @perma idNumber The ID number of the employee 
   */ 
   
   public void setID(int idNumber) { 
      id = idNumber; 
   } 
   
   /**
      The setHourPay method assings the hourly pay rate of the employee to the field
      @perma hourPayRate The hourly pay rate of the employee
   */ 
   
   public void setHourPay(double hourPayRate) { 
      hourPay = hourPayRate; 
   } 
   
   /**
      The setNumHours methods assigns the number of hour worked by the employee to the field\
      @perma numHoursWorked The number of hours the employee has worked
   */ 
   
   public void setNumHours(int numHoursWorked) { 
       numHours = numHoursWorked; 
   }
   
   /**
      The getName returns name
      @return name The name of the employee
   */
   
   public String getName() { 
      return name; 
   } 
   
   /** 
      The getID method returns id
      @return id The employee ID number
   */ 
   
   public int getID() { 
      return id;  
   } 
   
   /**
      The getHourPay method returns hourPay
      @return hourPay The hourly pay rate of the employee
   */ 
   
   public double getHourPay() { 
      return hourPay;  
   } 
   
   /**
      The hetNumHours method retrns numHours 
      @return numHours The number of hours the employee has worked
   */ 
   
   public int getNumHours() { 
       return numHours; 
   }
   
   /** 
      The getGrossPay method will calculate the gross pay of the employee and return the value 
      @return grossPay The gross pay of the employee 
   */ 
   
   public double getGrossPay() { 
      grossPay = hourPay * numHours;
      return grossPay; 
   }
} 