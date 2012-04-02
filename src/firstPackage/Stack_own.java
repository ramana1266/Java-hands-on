package firstPackage;
public class Stack_own {
	Object[] stackArr = new Object[10];  
	 int pos = -1;  
	 public boolean isEmpty() {  
	  if (this.size() == 0)  
	   return true;  
	  return false;  
	 }  
	  public Object pop() throws Exception {  
	  if (pos == -1)  
	   throw new Exception("Stack is empty");  
	  Object obj = stackArr[pos];  
	  stackArr[pos] = null;  
	  pos--;  
	  return obj;  
	 }  
	  
	 public void push(Object o) throws Exception {  
	  int npos = pos + 1;  
	  if (npos == 10)  
	   throw new Exception("Stack is full");  
	  pos = npos;  
	  stackArr[pos] = o;  
	 }  
	  
	 public int size() {  
  	  return pos + 1;  
	 }  
	  
	 public Object top() throws Exception {  
	  if (pos == -1)  
	   throw new Exception("Stack is empty");  
	  Object obj = stackArr[pos];  
	  return obj;  
	 }  
	 public static void main(String[] args)
	 {
		 try {
		 Stack_own mystack =  new Stack_own();
		 System.out.println(mystack.isEmpty());
		// System.out.println(mystack.pop());
		 mystack.push(2);
		 mystack.push(4);
		 mystack.push(3);
		 mystack.push(3);
		 System.out.println(mystack);
		 System.out.println(mystack.pop());
		 for(int i =0;i<mystack.size();i++)
		 System.out.println(mystack.stackArr[i]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}


