import java.util.Scanner;
class Switch
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter no = ");
		int a= input.nextInt();
		switch(a)
		{
			case 1: System.out.println("mon");
			break;
			case 2: System.out.println("tues");
			break;
			default: System.out.println("invalid");

		}
	}
}