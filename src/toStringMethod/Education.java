package toStringMethod;

public class Education 
{
        String Name,College,University;
        Education(String Name,String College,String University)
        {
        	this.Name=Name;
        	this.College=College;
        	this.University=University;
        }
        
     public String    toString()
     {
    	 return "Name: "+Name+"\nCollege: "+College+"\nUniversity: "+University;
     }
}
