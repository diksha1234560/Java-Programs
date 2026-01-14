class RemoveDuplicateCharacter
{
		public static void main(String [] args)
		{
			String a= "aaaa";
			String b="";
			int c=a.length();
			for(int i=0; i<c; i++)
			{
				int count=0;
				for(int j=i+1; j<c; j++)
					{
						if(a.charAt(i)==a.charAt(j))
						{
							count++;
						}
						
					}
				if(!(b.contains(String.valueOf(a.charAt(i)))))
						b=b+a.charAt(i);
				
			}
			System.out.println(b);
		}
}