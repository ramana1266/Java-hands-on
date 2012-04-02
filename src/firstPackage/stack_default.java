package firstPackage;
import java.util.*;

public class stack_default extends Stack<Integer> 
{
	public static void main(String[] args)
	{
		stack_default a= new stack_default();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		System.out.println(a);
		a.pop();
		System.out.println(a);
		System.out.println(a.empty());
		System.out.println(a.capacity());
		System.out.println(a.elementCount);
		System.out.println(a.capacityIncrement=20);
		System.out.println(a.capacity());
	}
	
}
