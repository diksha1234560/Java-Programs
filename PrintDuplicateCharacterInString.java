
class PrintDuplicateCharacterInString
{
		public static void main(String [] args)
		{
			String a= "abcdabcd";
			String b="";
			int c=a.length();
			for(int i=0; i<c; i++)
			{
				int count=0;
				if(!(b.contains(String.valueOf(a.charAt(i)))))
				{
					for(int j=i+1; j<c; j++)
					{
						if(a.charAt(i)==a.charAt(j))
						{
							count++;
						}
				
					}
				}
				if(count>=1)
				{
					b=b+a.charAt(i);
				}
			}
			System.out.println(b);
			if(b.isEmpty())	
			{
				System.out.println("no duplicate character in string");
			}
			else
			{
				System.out.println(b);
			}
		}
}