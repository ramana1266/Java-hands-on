//linked list to insert and delete at last(stack)
package firstPackage;

class node
{
	public int data;
	public node_ll link;
	node()
	{
		
	}
	node(int data)
	{
		this.data=data;
	}
}
public class linkedListStack 
{
	private node_ll top = new node_ll();
	linkedListStack()
	{
		top.link=null;
	}
	
	public boolean isEmpty()
	{
		if(top.link==null)
		return true;
		return false;
	}
	public void push(int data)
	{	
		node_ll node = new node_ll(data);
		node.link=top.link;
		top.link=node;
			
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("empty-cant delete");
			System.exit(0);
		}
		int tmp=top.data;
		top.link=top.link.link;
		return tmp;
	}

	public void printStack() {
        node_ll currentLink = top;
        System.out.println("List: ");
        while(currentLink != null) {
        	currentLink = currentLink.link;
        	if(currentLink!=null)
        	System.out.println(currentLink.data);
                
        }
}
	public static void main(String [] args)
	{
		linkedListStack mystack=new linkedListStack();
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.printStack();
		mystack.pop();
		mystack.printStack();
	}
}
