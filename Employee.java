/**
   The Employee class hold information pertaining to a employee
*/ 
public class Employee { 
   private String name;
   private int idNum;
   private String departmentName; 
   private String postion;
   
   /**
      Constructor for Employee class, values to null. 
   */
   public Employee() { 
      name = ""; 
      idNum = 0; 
      departmentName = ""; 
      postion = ""; 
   } 
   
   /**
   
   */
   public void setName(String employeeName)  {
      name = employeeName; 
   } 
   
   /**
   
   */ 
   
      public void setIDNum(int idNumber) { 
         idNum = idNumber; 
      } 
      
      /**
      
      */ 
      
      public void setDepartment(String department)  {
         departmentName = department; 
      } 
      
      /**
      
      */ 
      
      public void setPostion(String postionTitle) { 
         postion = postionTitle; 
      } 
      
      /**
      
      */
      
      public String getName() { 
         return name; 
      }
      
      /**
      
      */ 
      
      public int getIDNum() {
         return idNum; 
      } 
      
      /**
      
      */ 
      
      public String getDepartment() { 
         return departmentName; 
      } 
      
      /**
      
      */ 
      
      public String getPostion()  {
         return postion; 
      } 
} 


