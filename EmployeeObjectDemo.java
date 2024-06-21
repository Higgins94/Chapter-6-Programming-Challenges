/**
   The EmployeeObjectDemo class creates three new instances of the Employee class
   along with appropiate fields, then displays data.  
*/ 

public class EmployeeObjectDemo { 
   public static void main(String[] args) { 
      Employee SusanM = new Employee();
      Employee MarkJ = new Employee(); 
      Employee JoyR = new Employee(); 
      
      SusanM.setName("Susan Meyers"); 
      MarkJ.setName("Mark Jones"); 
      JoyR.setName("Joy Rogers"); 
      
      SusanM.setIDNum(47899);
      MarkJ.setIDNum(39119); 
      JoyR.setIDNum(81774); 
      
      SusanM.setDepartment("Accounting"); 
      MarkJ.setDepartment("IT"); 
      JoyR.setDepartment("Manufacturing"); 
      
      SusanM.setPostion("Vice President"); 
      MarkJ.setPostion("Programmer"); 
      JoyR.setPostion("Engineer"); 
      
      System.out.printf("\nEmployee Name: %s - ID Number: %d - Department: %s - Position Title: %s" ,SusanM.getName() ,SusanM.getIDNum() ,SusanM.getDepartment() ,SusanM.getPostion());
      System.out.printf("\nEmployee Name: %s - ID Number: %d - Department: %s - Position Title: %s" ,MarkJ.getName() ,MarkJ.getIDNum() ,MarkJ.getDepartment() ,MarkJ.getPostion());  
      System.out.printf("\nEmployee Name: %s - ID Number: %d - Department: %s - Position Title: %s" ,JoyR.getName() ,JoyR.getIDNum() ,JoyR.getDepartment() ,JoyR.getPostion());  
   }
}  