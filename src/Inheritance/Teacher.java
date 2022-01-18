package Inheritance;

public class Teacher extends Student
{
      String job;
      int salary;
      void display1()
      {
    	   display();
    	   System.out.println("Job Tittle: "+job);
    	   System.out.println("Salary: "+salary);
    	   
      }
}
