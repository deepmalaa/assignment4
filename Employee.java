// Name: Deepmala Bhomi          Date Assigned: 01/23/2020
//
// Course: CSCI 2003 42733       Date Due: 01/30/2020
//
// Instructor: Ms. Greer
//
// File name: Employee.java
//
/* Program Description: This class will stimulate employee. This class 
                        includes 6 instance variables, and constructors,setter 
                        and getter methods for each instance variable.*/
                        

/**
   Represents as Employee with the employeeName,
   employeeID, employeeWorkDept, employeePosition,
   startSalary and yearsWorked
*/
public class Employee
{

   //instance variables
   private String employeeName;
   private int employeeID;
   private String employeeWorkDept;
   private String employeePosition;
   private double startSalary;
   private int yearsWorked;
  
   
   //ARGUMENT CONSTRUCTORS
   /**
      Initializes the instance variables
   */
   public Employee()
   {
      employeeName = "";
      employeeID = 0;
      employeeWorkDept = "";
      employeePosition = "";
      startSalary = 0.0;
      yearsWorked = 0;
      
   }
   
   
   //NO-ARGUMENT CONSTRUCTOR
   /**
      Initializes the instance variables
      @param n name of the employee
      @param i employee's ID number 
      @param w name of employee's work department
      @param p employee's position in the company
      @param s employee's staring salary 
      @param y number of years employee has worked
   */   
   public Employee(String n, int i, String w, String p, double s, int y)
   {
      employeeName = n;
      employeeID = i;
      employeeWorkDept = w;
      employeePosition = p;
      startSalary = s;
      yearsWorked = y;
       
   }


   //SETTERS
   /**
      Sets employeeName instance variable
      @param n name of the employee
   */
   public void setEmployeeName(String n)
   {
      employeeName = n;
   }
   
   
   /**
      Sets employeeID instance variable
      @param i employee's ID number
   */
   public void setEmployeeID(int i)
   {
      employeeID = i;
   }
   

   /**
      Sets employeeWorkDept instance variable
      @param w name of employee's work department
   */
   public void setEmployeeWorkDept(String w)
   {
      employeeWorkDept = w;
   }


   /**
      Sets employeePosition instance variable
      @param p employee's position in the company
   */
   public void setEmployeePosition(String p)
   {
      employeePosition = p;  
   }
   

   /**
      Sets startSalary instance variable
      @param s employee's staring salary 
   */
   public void setStartSalary(double s)
   {
      startSalary = s;  
   }


   /**
      Sets yearsWorked instance variable
      @param y number of years employee has worked
   */
   public void setYearsWorked(int y)
   {
      yearsWorked = y;  
   }
   
   //GETTERS

   /**
      Returns value of instance variable employeeName
      @return name of the employee
   */
   public String getEmployeeName()
   {
      return employeeName;
   }
   
   
   /**
      Returns value of instance variable employeeID
      @return employee's employee ID
   */
   public int getEmployeeID()
   {
      return employeeID;
   }
   

   /**
      Returns value of instance variable employeeWorkDept
      @return name of employee's work department
   */
   public String getEmployeeWorkDept()
   {
      return employeeWorkDept;
   }
   

   /**
      Returns value of instance variable employeeposition
      @return employee's position in the companye
   */
   public String getEmployeePosition()
   {
      return employeePosition;  
   }
   

   /**
      Returns value of instance variable startSalary
      @return employee's starting salary
   */
   public double getStartSalary()
   {
      return startSalary;  
   }
   

   /**
      Returns value of instance variable yearsWorked
      @return number of years employee has worked  
   */
   public int getYearsWorked()
   {
      return yearsWorked;  
   }


   /**
      Returns current salary of the employee
      @return current salary of the employee
   */
   public double currentSalary()
   {
      return (startSalary + (startSalary * (yearsWorked * 0.02)));
      
   }
   
   
}        //end class