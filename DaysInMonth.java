/**
   The DaysInMonth class displays the number of days in a given month of a given year
*/ 
public class DaysInMonth { 

   private int month; 
   private int year;
   private int days; 
   private String leap; 
   
   /**
      Constructor args for month and year
      @perma monthNum The number that corresponds to the moth 
      @perma yearNum The date of the year the month is in
   */ 
   
   public DaysInMonth( int monthNum, int yearNum) { 
      month = monthNum; 
      year = yearNum; 
   } 
   
   /**
      The getNumOfDys determines what month the int represents in order to return days
      Leap years are also factored in for the number of days in Feburary
      @return days The number of the days the month has
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
   
 
  
