/**

*/
public class RetailItem { 
   private String description; 
   private int unitsOnHand;
   private double price; 
   
   /**
   Constructor 
   */ 
   
   public RetailItem(String descrip, int units, double cost) { 
      description = descrip; 
      unitsOnHand = units; 
      price = cost; 
   } 
   
   /**
      The setDescription method assigns description to field. 
      @perma description The description of the item.
   */ 
   
   public void setDescription(String descrip) { 
      description = descrip;
   } 
   
   /**
      The setUnits method assings units on hand to field
      @perma units The number of units on hand
   */ 
   
   public void setUnits(int units) { 
      unitsOnHand = units; 
   } 
   
   /**
      The setPrice method assings the price of the item to field
      @perma cost The price of the item
   */ 
   
   public void setPrice(double cost) { 
      price = cost; 
   } 
   
   /**
      The getDescription method returns description
      @return description The description of the item
   */ 
   
   public String getDescription() { 
      return description; 
   } 
   
    /**
      The getUnits method returns units
      @return units The number of units on hand
   */ 
   
   public int getUnits() { 
      return unitsOnHand; 
   } 
   
     /**
      The getPrice method returns price 
      @return price The price of the item
   */ 
   
   public double getPrice() { 
      return price; 
   } 
   
} 