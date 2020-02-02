// Name: Deepmala Bhomi          Date Assigned: 01/23/2020
//
// Course: CSCI 2003 42733       Date Due: 01/30/2020
//
// Instructor: Ms. Greer
//
// File name: EmployeeTester.java
//
// Program Description: This program tests the functionality of the Employee class
//                      using getters, setters and constructors.



/**
   Tests the functionality of the Employee class.
  */
public class EmployeeTester
{

   /**
      Peforms test to ensure functionality of Employee class
      @param args stores command line arguments
   */
   public static void main(String[] args)
   { 
        
      //TEST 1 - check if argument constructors initializes instant 
      //         variables correctly
      
      //creating employee1 object with argument constructor
      Employee employee1 = new Employee("Tyler Greer", 12345, "Computer Science",
      "Instructor", 35000.0 , 1);
      
      
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      System.out.println("----------------------------\n");
      
      
      
      // using getters to check if instant variables are initialiized correctly
      System.out.println(employee1.getEmployeeName());
      System.out.println("Expected : Tyler Greer\n");
      
      System.out.println(employee1.getEmployeeID());
      System.out.println("Expected : 12345\n");
      
      System.out.println(employee1.getEmployeeWorkDept());
      System.out.println("Expected : Computer Science\n");
      
      System.out.println(employee1.getEmployeePosition());
      System.out.println("Expected : Instructor\n");
      
      System.out.println(employee1.getStartSalary());
      System.out.println("Expected : 35000.0\n");
      
      System.out.println(employee1.getYearsWorked());
      System.out.println("Expected : 1\n");
      
      System.out.println(employee1.currentSalary());
      System.out.println("Expected : 35700.0\n\n");
     
            
      
      //TEST 2 - check if setters update instant variables correctly 
      
      //creating employee2 object with no-argument constructor
      Employee employee2 = new Employee();
      
      
      System.out.println("TESTING NO-ARGUMENT CONSTRUCTOR");
      System.out.println("----------------------------\n");
      
      
      //using setters to set values and update instance variables
      employee2.setEmployeeName("Desiree Wilson");
      
      // using getters to check if instant variables are updated correctly
      System.out.println(employee2.getEmployeeName());
      System.out.println("Expected : Desiree Wilson\n");
      
      
      
      //using setters to set values and update instance variables
      employee2.setEmployeeID(45678);
      
      // using getters to check if instant variables are updated correctly
      System.out.println(employee2.getEmployeeID());
      System.out.println("Expected : 45678\n");
      
      
      
      //using setters to set values and update instance variables
      employee2.setEmployeeWorkDept("Orthopedics");
      
      // using getters to check if instant variables are updated correctly
      System.out.println(employee2.getEmployeeWorkDept());
      System.out.println("Expected : Orthopedics\n");
      
      
      
      //using setters to set values and update instance variables
      employee2.setEmployeePosition("Registered Nurse");
      
      // using getters to check if instant variables are updated correctly
      System.out.println(employee2.getEmployeePosition());
      System.out.println("Expected : Registered Nurse\n");
      
      
      
      //using setters to set values and update instance variables
      employee2.setStartSalary(56000.0);
      
      // using getters to check if instant variables are updated correctly
      System.out.println(employee2.getStartSalary());
      System.out.println("Expected : 56000.0\n");
      
      
      
      //using setters to set values and update instance variables
      employee2.setYearsWorked(10);
      
      // using getters to check if instant variables are updated correctly
      System.out.println(employee2.getYearsWorked());
      System.out.println("Expected : 10\n");
      
      
      
      //calling currentSalary method to display the salary 
      System.out.println(employee2.currentSalary());
      System.out.println("Expected : 67200.0\n");
      

   }            //end main method
   
}            // end class