import java.util.Scanner;
  
public class AssertionExample
  {
 public static void main( String args[] )
  {
  Scanner scanner = new Scanner( System.in );
 
  System.out.print( "Enter a number between 0 and 20: " );
  int value = scanner.nextInt();
  assert( value >= 0 && value <= 20 ) :"Invalid number: " + value;
  System.out.printf( "You have entered %d\n", value );
 } 
  }
