import javax.swing.JOptionPane; 
/**
   The TestScoreDemo creates an instance of the TestScore class 
*/ 
public class TestScoreDemo { 
   public static void main(String[] args) { 
      
      int test1, test2, test3; 
      String input; 
      
      input = JOptionPane.showInputDialog("Enter the score for the first test"); 
      test1 = Integer.parseInt(input); 
      input = JOptionPane.showInputDialog("Enter the score for the first test"); 
      test2 = Integer.parseInt(input); 
      input = JOptionPane.showInputDialog("Enter the score for the first test"); 
      test3 = Integer.parseInt(input); 
      
      TestScores group1 = new TestScores(test1, test2, test3); 
      
      JOptionPane.showMessageDialog(null, String.format("The average is:  %.1f" ,group1.getAverage()));
      System.exit(0);  
   }
} 