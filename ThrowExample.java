class ThrowExample
{
	void getResult()
	{
		int a=10;
		int b=0;
		int d=2;
		try
		{
			int c=10/0;
			int e=10/2;
			System.out.println(c);
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());

		}
	}
	public static void main(String[] args)
	{
		ThrowExample a= new ThrowExample();
		a.getResult();
	}
}