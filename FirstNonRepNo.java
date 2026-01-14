class FirstNonRepNo
{
		public static void main(String [] args)
		{
			String a= "diksha";
			char[] b=a.toCharArray();
			int c=b.length;
			
			for(int i=0; i<c; i++)
			{
				int count=0;
				for(int j=0; j<c; j++)
				{
					if(b[i]==b[j])
					{
					  count++;
					}
				}
				if (count == 1)
				{
                			System.out.println(b[i]);
                			break;
           			}
			}
                          
		}
}