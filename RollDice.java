import javax.swing.JOptionPane; 
/**
   This program simulates rolling of the D&D dice.
*/
public class RollDice { 
   public static void main(String[] args) { 
   
      final int DIE1_SIDES = 6; 
      final int DIE2_SIDES = 12; 
      int maxRolls, whichDie; 
      String input, again = "Y";  
   
      Die die1 = new Die(DIE1_SIDES); 
      Die die2 = new Die(DIE2_SIDES);
   
      
         input = JOptionPane.showInputDialog("1. Die One: 6 sides\n2. Die Two: 12 sides"); 
         whichDie = Integer.parseInt(input);
         input = JOptionPane.showInputDialog("Number of rolls?"); 
         maxRolls = Integer.parseInt(input);
         if (whichDie == 1) {
            for (int i = 1; i <= maxRolls; i++) { 
               die1.roll(); 
               JOptionPane.showMessageDialog(null, "Roll Number " + i + ":\n" + die1.getValue());
            }
         } else if (whichDie == 2) { 
            for (int i = 1; i <= maxRolls; i++) { 
               die1.roll(); 
               JOptionPane.showMessageDialog(null, "Roll Number " + i + ":\n" + die2.getValue());
            }    
      } 
   }
}  
       
   
   