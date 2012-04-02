//linked list to insert and delete at last(stack)
package firstPackage;

class node_ll
{
	public int data;
	public node_ll link;
	node_ll()
	{
		
	}
	node_ll(int data)
	{
		this.data=data;
	}
}
public class llAddnDelMiddle 
{
	private node_ll top = new node_ll();
	static int size = 0;
	llAddnDelMiddle()
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
		node_ll node_ll = new node_ll(data);
		node_ll.link=top.link;
		top.link=node_ll;
		size++;
			
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
		size--;
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
	public void pushmiddle(int loc,int data)
	{
		node_ll node_ll = new node_ll(data);
		node_ll currentlink=top;
		for(int i =0;i<size-loc+1;i++)
		{
			currentlink=currentlink.link;
		}
		node_ll.link=currentlink.link;
		currentlink.link=node_ll;
		//top.link=node_ll;
		size++;
	}
	public int popmiddle(int loc)
	{
		if(size<loc)
		{
			System.out.println("cant delete");
			System.exit(0);
		}
		node_ll currentlink=top;
		for(int i =0;i<size-loc;i++)
		{
			currentlink=currentlink.link;
		}
		int tmp=currentlink.data;
		currentlink.link=currentlink.link.link;
		size--;
		return tmp;
	}
	public static void main(String [] args)
	{
		llAddnDelMiddle mystack=new llAddnDelMiddle();
		mystack.push(1);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.printStack();
		mystack.pushmiddle(2, 2);
		mystack.pushmiddle(2, 2);
		mystack.printStack();
		mystack.popmiddle(2);
		mystack.printStack();
	}
}
