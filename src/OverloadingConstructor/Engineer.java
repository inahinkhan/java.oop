package OverloadingConstructor;

public class Engineer
{
         String name,dept;
         int age;
         Engineer()
         {
        	 System.out.println("None");
         }
         Engineer(String name,int age)
         {
        	 this.name=name;
        	 this.age=age;
         }
         Engineer(String name,int age,String dept)
         {
        	 this.name=name;
        	 this.age=age;
        	 this.dept=dept;
         }
         void display()
         {
        	 System.out.println("Name: "+name);
        	 System.out.println("Age: "+age);
        	 System.out.println("Type: "+dept);
         }
}
