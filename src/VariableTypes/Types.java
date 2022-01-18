package VariableTypes;

public class Types
{ 
	String name,section;    //Instance variable-- name,section,roll
	int roll;
	static String result="Grade: A+";
	void set(String n,String  s,int r)
	{
		name=n;     //Local variable--  n,s,r;
		section=s;
		roll=r;
	}
		 void show()
		 {
			 System.out.println("Name: "+name);
			 System.out.println("Roll No: "+roll);
			 System.out.println("Section: "+section);
			 System.out.println(result);
		 }
		 
		 public static void main(String[] args)
		     {
		              Types check=new Types();
		              check.set("Nahin Khan", "Science-B", 41);
		               check.show();
		    }
		

}
