package strings;

public class RevByWords {
	public static void main(String [] args)
	{
		String s1="This    is Ramana Malladi Venkata Sai";
		String s2="";
		int i=s1.length();
		for(int j=s1.length()-1;j>=0;j--)
		{
			if(s1.charAt(j)==' ')
			{
				s2=s2+ s1.substring(j+1, i)+" ";
				i=j;
			}
			else if (j-1<0)
			{
				s2=s2+s1.substring(j, i);
			}
			
		}
		
		System.out.println(s2);
	}
	

}
