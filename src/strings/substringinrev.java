package strings;

class substringinrev
{
	public static void main(String[] args) 
	{
		String s="abccbaad";
		StringBuffer sb = new StringBuffer(s.substring(0,3));
		String s1=sb.reverse().toString();
		if(s.contains(s1))
		{
			System.out.println(s1);
		}
		else
		System.out.println("not found");
	}
}