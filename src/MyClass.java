import java.lang.*;
public class MyClass implements Cloneable {
	public MyClass clone() throws CloneNotSupportedException {
        return (MyClass) super.clone();
}
	public void call()
	{
		System.out.println("asasa");
	}

	public static void main(String [] args) 
	{
		MyClass o1, o2;
		o1=new MyClass();
		o2=(MyClass) o1.clone();
		o1=null;
		o2.call();
	}
}
