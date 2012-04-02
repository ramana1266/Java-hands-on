
             interface Shape
             {
                  void draw();  
                  void displayArea(float a,float b);
             }
             class Square implements Shape
             { 
                  public void draw()
                  {
                	  System.out.println("Drawing Square");
                  }
                  public void displayArea(float a,float b) 
                     { 
                          System.out.println("Area is "+a*b);}
                     }
           public class InfDemo{
                  public static void main(String args[])
                   {  Square s=new Square();
                      s.draw();
                      s.displayArea(5,5);
                   }
           }