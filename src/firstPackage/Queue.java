package firstPackage;
import java.util.*;
public class Queue {
		   private int qMaxSize;// max queue size
		   private int front_pointer = 0;  // front pointer
		   private int rear_pointer = 0;  // rear pointer
		   private int queue_size = 0;  // size of queue
		   private char[] q;    // actual queue

		   public Queue(int size) 
		   {
		      qMaxSize = size;
		      front_pointer = 0;
		      rear_pointer = -1;
		      queue_size = 0;
		      q = new char[qMaxSize];
		   }

		   public void delete() {
		      if (!emptyq()) {
		       //  q[front_pointer] = 'n';
		         front_pointer = (front_pointer + 1)%qMaxSize;
		         queue_size--;
		         //return q[front_pointer];
		      }
		      else {
		         System.err.println("Underflow");
		         //return '?';
		      }
		   }

		   public void insert(char c) {
		      if (!fullq()) {
		         queue_size++;
		         rear_pointer = (rear_pointer + 1)%qMaxSize;
		         q[rear_pointer] = c;
		      }
		      else
		         System.err.println("Overflow\n");
		   }

		   public boolean emptyq() {
		      return queue_size == -1;
		   }

		   public boolean fullq() {
		      return queue_size == qMaxSize;
		   }
		   public void printq() {
		     System.out.print("Size: " + queue_size +", rp: " + rear_pointer + ", fp: " + front_pointer + ", q: ");
		      for (int i = 0; i < qMaxSize; i++)
		         System.out.print("q[" + i + "]="+ q[i] + "; ");
		      System.out.println();
		   }
		   public static void main(String [] args)
		   {
			   Queue myq=new Queue(4);
			   myq.insert('a');
			   myq.insert('b');
			   myq.insert('c');
			   myq.printq();
			   myq.insert('d');
			   myq.printq();
			   myq.delete();
			   myq.printq();
			   myq.insert('e');
			   myq.printq();
			   myq.delete();
			   myq.insert('f');
			   myq.printq();
			   myq.delete();
			   myq.printq();
			   myq.insert('g');
			   myq.printq();
		   }
		}
	