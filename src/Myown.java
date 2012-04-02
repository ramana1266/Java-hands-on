import java.util.*;
public class Myown {

  public static void main(String[] args) {
      List ts1 = new ArrayList();
		Org foofle=new Org("foofle",1000000,5000);
		Org ficrofost=new Org("ficrofost",1000001,4000);
ts1.add(foofle);
ts1.add(ficrofost);
      //ts1.add(new Org ("Tom",40000.00));
      //ts1.add(new Employee ("Harry",20000.00));
      //ts1.add(new Employee ("Maggie",50000.00));
      //ts1.add(new Employee ("Chris",70000.00));
      Collections.sort(ts1);
      Iterator itr = ts1.iterator();
      while(itr.hasNext()){
          Object element = itr.next();
          System.out.println(element + "\n");   
      }
  }
}
  