class VowelCount
{
	public static void main(String [] args)
	{	
		String name = "harsh";
		int count=0;
		int count1=0;
		for(int i=0; i<name.length(); i++)
		{
		
			char a= name.charAt(i);
			if(a>='a'&& a<='z')
			{
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}
}