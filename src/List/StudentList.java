package List;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentList 
{
    public static void main(String[] args)
      {
    	Scanner input=new Scanner(System.in);
		  LinkedList<Student> details=new LinkedList<Student>();
		  Student s1=new Student("Nahin Khan",34,333,3.1f);
		  Student s2=new Student("Arnob Gosh",30,233,3.3f);
		  Student s3=new Student("Md Habib  ",67,455,3.5f);
		  Student s4=new Student("Nayeem Ul ",100,491,3.7f);
		  details.add(s1);
		  details.add(s2);
		  details.add(s3);
		  details.add(s4);
		  System.out.println("    Name   "+"\t\t \t   Id No"+"\t\t\tMarks"+"\t\t\t    Grade " );
		  for(Student show:details)
		  {
			  System.out.println(show.name+"              -           "+show.id+"              -           "+show.marks+"              -           "+show.grade);
		  }

	  }
}
