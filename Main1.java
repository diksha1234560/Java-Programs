class  MethodOverriding
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
class MethodOverriding1 extends MethodOverriding
{
	public int add(int a, int b)
	{
		return a*b;
	}

}
class Main1
{
	public static void main(String [] args)
	{	
		MethodOverriding a= new MethodOverriding1();
		System.out.println(a.add(2, 3));
		System.out.println(a.add(2, 3));
	}
}