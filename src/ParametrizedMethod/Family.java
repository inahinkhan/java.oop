package ParametrizedMethod;

public class Family
{
	String name,gender;
	int age;
	float height;
    void set(String name,String gender,int age,float height)
     {
    	 this.name=name;
    	 this.gender=gender;
    	 this.age=age;
    	 this.height=height;
    	
     }
     
     void display()
     {
    	 System.out.println("NAME: "+name);
    	 System.out.println("GENDER: "+gender);
    	 System.out.println("AGE: "+age);
    	 System.out.println("HEIGHT: "+height);
     }
}
