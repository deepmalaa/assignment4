// Name: Deepmala Bhomi          Date Assigned: 01/23/2020
//
// Course: CSCI 2003 42733       Date Due: 01/30/2020
//
// Instructor: Ms. Greer
//
// File name: Company.java
//
// Program Description: This class will use employee class to stimulate 3 employees,
//                      Using methods from the Employee class, this program calculates 
//                      and display current salary of employee along with other 
//                      general informations of the employee. 



/**
 * Displays data of three employees.
 */
public class Company
{

   /**
    * Creating main method
      @param args stores command line arguments
    */
   public static void main(String[] args)
   { 
    
      //creating employee1 object with no-argument constructor
      Employee employee1 = new Employee();
      
      //creating employee2 object with argument constructor
      Employee employee2 = new Employee("Mark Jones",39119,"IT","Programmer",
                           85000.00,5);
                           
      //creating employee3 object with argument construtor
      Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing",
                           "Engineer", 83000.00 , 3);
         
         
                           
      //using setters to set values or update instant variables
      employee1.setEmployeeName("Susan Meyers");
      employee1.setEmployeeID(47899);
      employee1.setEmployeeWorkDept("Accounting");
      employee1.setEmployeePosition("Vice President");
      employee1.setStartSalary(75000.00);
      employee1.setYearsWorked(15);
      
     
     
      //displaying table header
      System.out.printf("%-20s%-15s%-20s%-20s%-15s\n",
      "Name","ID Number", "Department", "Position", "Salary");
      System.out.println("---------------------------------------------------------------------------------------"); 
      
      
      //displaying information about employees
      
      System.out.printf("%-20s%-15d%-20s%-20s$%-15.2f\n",
      employee1.getEmployeeName(), employee1.getEmployeeID(), employee1.getEmployeeWorkDept(),
      employee1.getEmployeePosition(), employee1.currentSalary());
       
       
      System.out.printf("%-20s%-15d%-20s%-20s$%-15.2f\n",
      employee2.getEmployeeName(), employee2.getEmployeeID(), employee2.getEmployeeWorkDept(),
      employee2.getEmployeePosition(), employee2.currentSalary());
       
       
      System.out.printf("%-20s%-15d%-20s%-20s$%-15.2f\n",
      employee3.getEmployeeName(), employee3.getEmployeeID(), employee3.getEmployeeWorkDept(), 
      employee3.getEmployeePosition(), employee3.currentSalary());

      
        
   }    //end main method
   
}      //end class