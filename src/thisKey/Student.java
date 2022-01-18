package thisKey;

public class Student 
{
	String name,id,gender;
	int age;
	Student(String name ,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	Student(String name ,int age,String id,String gender)
	{
		this(name,age,gender);
		this.id=id;
	}
	
void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Id: "+id);
		System.out.println("Gender: "+gender);
    }
}
