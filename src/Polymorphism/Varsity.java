package Polymorphism;
//Method overloading Polymorphism [ Compile time - static binding  ]
public class Varsity
{
	static String vname="Daffodil International University";
	String name,id,gender;
	int age;
	void play(String name,int age,String id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	void play(String name,int age,String id,String gender)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.gender=gender;
	}
	void play()
	{
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Id No: "+id);
		System.out.println("Gender: "+gender);
		System.out.println("University: " +vname);
	}

}
