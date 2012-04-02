package strings;
public class IntegerToString
{
    public static void main(String[] args)
    {
        int integer = -987654321;
        toString(integer);
    }
    
    private static void toString(int integer)
    {
      System.out.println(Integer.toString(integer));
      System.out.println(Integer.toString(integer)+9);
    }
    /*private static void toString(int integer, int radix) // implementation
    {
        StringBuilder string = new StringBuilder();
        boolean isNegative = (integer < 0);
        integer = Math.abs(integer);
        
        double length = Math.log(integer) / Math.log(radix);
        for (int i = 0; i < length; i++)
        {
            string.append(integer % radix);
            integer /= radix;
        }
        if (isNegative)
            string.append("-");
        System.out.println(string.reverse());
    }*/
}