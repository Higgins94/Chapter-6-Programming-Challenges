/**
   The PersonalInformationClass holds personal data 
*/
public class PersonalInformationClass { 

   private String name; 
   private String address; 
   private int age; 
   private String phoneNum; 
 
   /**
      The setName method assigns name to field.
      @perma personName The name value of the person. 
   */
   public void setName(String personName) {
      name = personName; 
   } 
   
   /**
      The setAddress method assings address to field 
      @perma personAddress The address value of the person.
   */  
   
   public void setAddress(String personAddress) { 
      address = personAddress; 
   } 
   
   /**
      The setAge method assings age value to field. 
      @perma personAge The value for the age of the person. 
   */ 
   
   public void setAge(int personAge) { 
      age = personAge; 
   } 
   
   /**
      The setPhoneNum method assings the value for phone number to field. 
      @perma phoneNumber The value for the phone number of the person.
   */
   
   public void setPhoneNum(String phoneNumber) { 
      phoneNum = phoneNumber; 
   } 
   
   /**
      The getName method returns name. 
      @return name The name of the person.
   */
   public String getName() { 
      return name; 
   }
   
    /**
      The getAddress method returns the person's address. 
      @return address The address of the person.
   */
   public String getAddress() { 
      return address; 
   } 
   
    /**
      The getAge method returns age. 
      @return age The age of the person.
   */
   public int getAge() { 
      return age; 
   } 
   
    /**
      The getPhoneNum method returns phoneNum. 
      @return phoneNum The phone number of the person.
   */
   public String getPhoneNum() { 
      return phoneNum; 
   }  
}
   
   