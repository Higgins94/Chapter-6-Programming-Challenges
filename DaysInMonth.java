/**
   The DaysInMonth class displays the number of days in a given month of a given year
*/ 
public class DaysInMonth { 

   private int month; 
   private int year;
   private int days; 
   private String leap; 
   
   /**
   
   */ 
   
   public DaysInMonth( int monthNum, int yearNum) { 
      month = monthNum; 
      year = yearNum; 
   } 
   
   /**
   
   */ 
   
   public int getNumOfDays() {
      if (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12)  
         days = 31; 
      else if (month == 4 && month == 6 && month == 7 && month == 11) 
         days = 30; 
      else if (year % 100 == 0 && year % 400 == 0)
         days = 30;
      else 
         days = 29; 
      return days; 
   }
}   
   
 
  