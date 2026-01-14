class Xyz
{
	public static void main(String [] args)
		{
			String a= "aabbcc";
			String b="";
			int c = a.length();
			int count=0;
			for(int i=0; i<c; i++)
			{
				 count=0;
				for(int j=0; j<c; j++)
				{
					if(a.charAt(i)==a.charAt(j))
					{
					  count++;
					}
				}
				if (count == 1)
				{
                			System.out.println(a.charAt(i));
                			break;
           			}
			}
			if(a.isEmpty())	
			{
				System.out.println("string is empty");
			}
                          
		}
}
