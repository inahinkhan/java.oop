package FILE;

import java.io.File;

public class Create 
//
{
public static void main(String[] args) 
{
	File make=new File("C:/Users/Asus/OneDrive/Desktop/Engineer");
	make.mkdir();      //Directory hac created
	System.out.println("Folder name: "+make.getName());
	System.out.println("Path: "+make.getAbsolutePath());
	File No1=new File("C:/Users/Asus/OneDrive/Desktop/Engineer/Student.pptx");
	File No2=new File("C:/Users/Asus/OneDrive/Desktop/Engineer/Student.pdf");
	File No3=new File("C:/Users/Asus/OneDrive/Desktop/Engineer/Student.doc");
	File No4=new File("C:/Users/Asus/OneDrive/Desktop/Engineer/Student.txt");
	try {
		 No1.createNewFile();
		 No2.createNewFile();
		 No3.createNewFile();
		 No4.createNewFile();
		 System.out.println("Files Are Created");
		 
	}catch(Exception E)
	{
		System.out.println(E);
	}
	
	
}

}
