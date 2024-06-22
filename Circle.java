/**
   The Circle class hold a field for the radius of circle aswell 
   as calcuclates for area, diameter, and circumference
*/ 
public class Circle { 
   
   private double radius; 
   private double PI = 3.14159; 
   private double area;
   private double diameter;  
   private double circumference; 
   
   /**
      No arg Constructor
   */
   public Circle() { 
      radius = 0.0; 
   } 
   
   /**
   Constructor for radius arg
   */ 
   
   public Circle (double r) { 
      radius = r; 
   } 
   
   /**
      The setRadius method sets the value for the radius of the circle
      @perma r The value for the radius
   */ 
   
   public void setRadius(double r) { 
      radius = r; 
   } 
   
   /**
      The getRadius method returns radius
      @return radius The value for the radius of the circle 
   */ 
   
   public double getRadius() { 
      return radius; 
   } 
   
   /**
      The getArea method calculates and returns area 
      @return area The value for the calculated area of the circle 
   */ 
   
   public double getArea() { 
      area = PI * radius * radius;
      return area; 
   } 
   
   /**
      The getDiameter method calculates the diamater of the circle
      @return diameter The calculated diameter of the circle 
   */ 
   
   public double getDiameter() { 
      diameter = radius * 2; 
      return diameter; 
   } 
   
   /**
      The getCircumference method caculates the circumference of the circle 
      @return circumference The value for the circumference of the circle 
   */ 
   
   public double getCircumference() { 
      circumference = 2.0 *PI * radius;  
      return circumference; 
   } 
} 


      
      
      