/**
   The CreateRItems creates three instances of the RetailItem class
*/ 
public class CreateRItems { 
   public static void main(String[] args) { 
   
      String item1Descrip = "Jacket"; 
      String item2Descrip = "Designer Jeans"; 
      String item3Descrip = "Shirt"; 
      
      int item1Units = 12; 
      int item2Units = 40; 
      int item3Units = 20;
      
      double item1Price = 59.99; 
      double item2Price = 34.95; 
      double item3Price = 24.95; 
      
      RetailItem item1 = new RetailItem(item1Descrip, item1Units, item1Price);  
      RetailItem item2 = new RetailItem(item1Descrip, item1Units, item1Price); 
      RetailItem item3 = new RetailItem(item1Descrip, item1Units, item1Price); 
   } 
} 
      
      
   