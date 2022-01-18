package Has;
import java.util.HashSet;
public class Hashset
{
    public static void main(String[] args)
     {
		    HashSet<String>  fruit=new HashSet<String>();
		    fruit.add("Mango");
		    fruit.add("Apple");
		    fruit.add("Apple");  // Don't count same thing in hashmap
		    System.out.println(fruit);
		    System.out.println("Size: "+fruit.size());
		    fruit.remove("Apple");
		    System.out.println(fruit);
		    fruit.clear();
	 }
}
