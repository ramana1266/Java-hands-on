package firstPackage;

public class InsertionSort 
{
	public static void isort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i;
			int tmp=a[j];
			while(j>0 && a[j-1]>tmp)
			{
				a[j]=a[j-1];
				j--;
				
			}
			a[j]=tmp;
		}
		
	}
	public static void main(String [] args)
	{
		int[] a = {9,8,7,6,5,4,3,2,1};
		isort(a);
		for(int i= 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}
}
