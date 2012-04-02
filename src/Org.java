import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import java.util.*;
public class Org implements Comparable {
	String name;
	Integer revenue;
	int emplCount;
	public Org(String name,Integer revenue, int emplCount)
	{
		this.name=name;
		this.revenue=revenue;
		this.emplCount=emplCount;
		
	}
	public int compareTo(Object obj1)
	{
		if (this.revenue == ((Org) obj1).revenue)
	           return 0;
	       else if ((this.revenue) > ((Org) obj1).revenue)
	           return 1;
	       else
	           return -1;
	}
	 public String toString() {
	       return "Org " + name  + "\n" ;
	   }
	 public static void main(String[] args) {
	      List list1 = new ArrayList();
			Org org1=new Org("org1",1000000,5000);
			Org org2=new Org("org2",1000001,4000);
			Org org3=new Org("org3",1000002,4000);
			Org org4=new Org("org4",1000003,4000);
			Org org5=new Org("org5",1000004,4000);
			Org org6=new Org("org6",1000005,4000);
			
	list1.add(org1);
	list1.add(org2);
	list1.add(org3);
	list1.add(org4);
	list1.add(org5);
	list1.add(org6);
	      Collections.sort(list1);
	      Iterator itr = list1.iterator();
	      System.out.println("The list of organizations in the ascending order of revenue are");
	      while(itr.hasNext()){
	          Object element = itr.next();
	          System.out.println(element + "\n");   
	      }
	}
	
}


