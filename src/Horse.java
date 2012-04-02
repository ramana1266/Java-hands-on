class Animal   {
      public void eat()  {  //method 0 
      	System.out.println("Generic animal eating generically");
    }
}

public class Horse extends Animal {
     public static void main(String [] arg) {
    	Animal a = new Horse();
           	a.eat();
     }

     public void eat() { //method 1 
       	System.out.println("Horse eating hay ");
     }

     public void eat(String s) { //method 2
       	System.out.println("Horse eating " + s);
     }
}