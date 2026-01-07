class ArrayValue
{
	public static void main(String[] args)
	{
		int[] number= new int[4];
		number[0]=45;
		number[1]=34;
		number[2]=46;
		number[3]=76;
		
		/*for(int i=0; i<number.length; i++)
		{
			System.out.println(number[i]);
		}*/
		for(int i=0; i<number.length; i++)
		{
			int b=0;
			for (int j=i+1; j<number.length; j++)
			{
				if(number[i]>number[j])
				{
					b=number[i];
					number[i]=number[j];
					number[j]=b;
				}
				

			}
			
		}
		for(int i=0; i<number.length; i++)
  		{
			System.out.println(number[i]);
		}
		
	}
}