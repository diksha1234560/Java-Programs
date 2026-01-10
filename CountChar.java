class CountChar
{
	public static void main(String[] args)
	{
		String a ="aaabbcabcdab";
		String b="";
		int s=a.length();
		System.out.println(s);
		for(int i=0; i<s; i++)
		{
			int count =0;
				
			if(!(b.contains(String.valueOf(a.charAt(i)))))
			{
					
				for(int j=0; j<s; j++)
				{
					if(a.charAt(i)==a.charAt(j))
					{
						count++;
						
						
					}
				}
				System.out.println(a.charAt(i) +"="+ count);
				b=b+a.charAt(i);
			}
			
			
			
		}
		
		System.out.println(b);			
	}
}