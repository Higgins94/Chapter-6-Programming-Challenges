/**
   The TestScore class holds three test score fields and an average field 
*/ 
public class TestScores { 

   private int test1; 
   private int test2; 
   private int test3;
   private double average; 
  
   /**
      Constructor
   */
   
   public TestScores (int testOne, int testTwo, int testThree) { 
      test1 = testOne;  
      test2 = testTwo;  
      test3 = testThree;  
   } 
   
   /**
      The setTest1 method sets the value for test1 field 
      @perma test1 The value for the score of the first test
   */ 
   
   public void setTest1(int testOne) { 
      test1 = testOne;
   } 
   
    /**
      The setTest2 method sets the value for test2 field 
      @perma test2 The value for the score of the second test
   */ 
   
   public void setTest2(int testTwo) { 
      test2 = testTwo; 
   } 
   
    /**
      The setTest3 method sets the value for the test3 field
      @perma test3 The value for the score of the third test
   */ 
   
   public void setTest3(int testThree) { 
      test3 = testThree; 
   } 
   
   /**
      The getTest1 method returns test1
      @return test1 The value for the score of test1 
   */ 
   
   public int getTest1() { 
      return test1; 
   } 
   
      
   /**
      The getTest2 method returns test2 
      @return test2 The value for the score of the second test
   */ 
   
   public int getTest2() { 
      return test2; 
   } 
  
   /**
      The getTest3 method returns test3 
      @return test3 The value for the score of the second test
   */ 
   
   public int getTest3() { 
      return test3; 
   } 
   
   /**
      The getAverage method calculates the average of the three test scores
      @return average The value of the average
   */ 
   
   public double getAverage() {
      average = (test1 + test2 + test3) / 3.0; 
      return average; 
   } 
} 
   
   
   