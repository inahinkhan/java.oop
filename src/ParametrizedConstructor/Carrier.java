package ParametrizedConstructor;

public class Carrier
{
	  String name,skill,job;
	     int age,phone;
	     Carrier(String name,int age,String skill,String job,int phone)
	     {
	    	 this.name=name;
	    	 this.age=age;
	    	 this.skill=skill;
	    	 this.job=job;
	    	 this.phone=phone;
	     }
	     void display()
	     {
	    	 System.out.println("Name: "+name);
	    	 System.out.println("Age: "+age);
	    	 System.out.println("Skills: "+skill);
	    	 System.out.println("I want to be an "+job);
	    	 System.out.println("Phone: +880"+phone);
	     }
}
