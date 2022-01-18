package SuperKey;

public class VehicleRun
{
     public static void main(String[] args) 
       {
    	 System.out.println("\t\tVehicle List\n");
	            Rickshaw ob=new Rickshaw("Rickshaw","Blue",3,15000,"Leg");
	            Bike obj=new Bike("Bike","Black",2,250000,"Engine,Mobil,Petrol");
	            ob.print();
	            System.out.print("\n");
	            obj.print1();
	   }
}
