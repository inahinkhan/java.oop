package staticVariable;

public class Education
{
      String name,gender,id;
      static String varsity="Daffodil International Universirty";
      
      Education(String name,String gender,String id)
      {
    	   this.name=name;
    	   this.gender=gender;
    	   this.id=id;
      }
      void display()
      {
    	  System.out.println("Name: "+name);
    	  System.out.println("Id No: "+id);
    	  System.out.println("Gender: "+gender);
    	  System.out.println("University: "+varsity);
      }
}
