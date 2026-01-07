class MethodOverloading
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}

}
class Main
{
	public static void main(String [] args)
	{	
		MethodOverloading a= new MethodOverloading();
		System.out.println(a.add(2, 3));
		System.out.println(a.add(2,3,4));
	}
}