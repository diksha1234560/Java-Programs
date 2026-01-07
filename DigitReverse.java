import java.util.Scanner;
class DigitReverse
{
	public static void main(String [] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("enter number : ");
		int a=input.nextInt();
		int c=a;
		int b=0;
		while(a>0)
		{
		 	b=b*10+a%10;
			a=a/10;
		}
		System.out.println("reverse no is : "+ b);
		if(c==b)
		{
			System.out.println("pallidrome number");
		}
		else
			{
			System.out.println("not pallidrome number");
			}
	}
} 