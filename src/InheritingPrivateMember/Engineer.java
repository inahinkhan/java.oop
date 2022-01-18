package InheritingPrivateMember;

public class Engineer
{
          private String name,gender,dept,job;
          float age,salary;
           public void setName(String name)
           {
        	   this.name=name;
           }
           public String  getName()
           {
        	   return name;
           }
           
           public void setGender(String gender)
           {
        	   this.gender=gender;
           }
           public String  getGender()
           {
        	   return gender;
           }
           
           public void setDept(String dept)
           {
        	   this.dept=dept;
           }
           public String getDept()
           {
        	   return dept;
           }
           
        
           
          
          public void setAge(float age)
           {
        	  this.age=age;
           }
           public float  getAge()
           {
        	   return age;
           }
           
           
           
           public void setSalary(float salary)
           {
        	  this.salary=salary;
           }
           public float  getSalary()
           {
        	   return salary;
           }
           
           void show()
           {
        	   System.out.println("Name:  "+getName());
        	   System.out.println("Gender: "+getGender());
        	   System.out.println("Age: "+getAge());
        	   System.out.println("Dept: "+getDept());
        	   System.out.println("Salary: "+getSalary());
           }
           
       
          
}
