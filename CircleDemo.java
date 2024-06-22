import java.util.Scanner; 
/**
   The CircleDemo class creates an instance of the Circle class
*/ 
public class CircleDemo { 
   public static void main(String[] args) { 
      
      double radius; 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Enter the radius of the circle: "); 
      radius = scan.nextDouble(); 
      
      Circle circle = new Circle(radius); 
      
      System.out.printf("\nArea: %,.1f\n Diameter: %,.1f\n Area: %,.1f" ,circle.getArea() ,circle.getDiameter() ,circle.getCircumference()); 
   }
} 