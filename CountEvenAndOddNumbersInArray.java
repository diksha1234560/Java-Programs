class CountEvenAndOddNumbersInArray
{
	public static void main(String[] args)
	{
		int number[]={};
		int j=0;
		int k=0;
		for(int i=0; i<number.length; i++)
		{
			if(number[i]%2==0)
			{
				j++;
			}
			if(number[i]%2!=0)
			{
				k++;
			}

		}
		System.out.println("even count is "+ j );
		System.out.println("odd count is "+ k );
	}
}