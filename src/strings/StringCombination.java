package strings;
public class StringCombination {

    // print all subsets of the characters in s
    public static void comb1(String s) { comb1("", s); }
    

    // print all subsets of the remaining elements, with given prefix 
    private static void comb1(String prefix, String s)
    {
        if (s.length() > 0) 
        {
            System.out.println(prefix + s.charAt(0));
            comb1(prefix + s.charAt(0), s.substring(1));
            comb1(prefix,               s.substring(1));
        }
    }
    
    public static void main(String [] args)
    {
    	comb1("abc");
    	
    }
}