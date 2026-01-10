class ReverseWordsInString
{
	public static void main (String[] args)
	{
		String a="i love india";
		String [] b= a.split(" ");
		
        	//char d;
		/*for(int i=0; i< b.length; i++)
		{
		System.out.println(b[i]);	
		}*/
		for(int i=0; i< b.length; i++)
		{
			String c="";
			for(int j=b[i].length()-1;j>=0; j--)
			{
				c=c+b[i].charAt(j);
					
			}
			System.out.print(c+" ");
		}
		
	}
}