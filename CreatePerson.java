import javax.swing.JOptionPane; 
/**
   The CreatePerson Method creates three instances of the 
   PersonalInformationClass class. 
*/
public class CreatePerson { 
   public static void main(String [] args) { 
   
      PersonalInformationClass person1 = new PersonalInformationClass();
      PersonalInformationClass person2 = new PersonalInformationClass();
      PersonalInformationClass person3 = new PersonalInformationClass(); 
   
      String input; 
      int age;
       
      input = JOptionPane.showInputDialog("Enter your name"); 
      person1.setName(input); 
      input = JOptionPane.showInputDialog("Enter your address"); 
      person1.setAddress(input); 
      input = JOptionPane.showInputDialog("Enter your age"); 
      age = Integer.parseInt(input); 
      person1.setAge(age); 
      input = JOptionPane.showInputDialog("Enter your phone number"); 
      person1.setPhoneNum(input);
      
      
      input = JOptionPane.showInputDialog("Enter name of family/friend member"); 
      person2.setName(input); 
      input = JOptionPane.showInputDialog("Enter their address"); 
      person2.setAddress(input); 
      input = JOptionPane.showInputDialog("Enter their age"); 
      age = Integer.parseInt(input); 
      person2.setAge(age); 
      input = JOptionPane.showInputDialog("Enter their phone number"); 
      person2.setPhoneNum(input);  
      
      input = JOptionPane.showInputDialog("Enter name of family/friend member"); 
      person3.setName(input); 
      input = JOptionPane.showInputDialog("Enter their address"); 
      person3.setAddress(input); 
      input = JOptionPane.showInputDialog("Enter their age"); 
      age = Integer.parseInt(input); 
      person3.setAge(age); 
      input = JOptionPane.showInputDialog("Enter their phone number"); 
      person3.setPhoneNum(input);  
   }
}
      
      
  
       
   
  