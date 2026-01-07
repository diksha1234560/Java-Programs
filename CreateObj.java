class Car
{
	String Color;
	int speed;
	public void drive()
	{
		System.out.println("car is driving with"+speed+"speed and color is "+ Color);
	}
}
class CreateObj
{
	public static void main(String[] args)
	{
		Car myCar=new Car();
		myCar.speed=60;
		myCar.Color="red";
		myCar.drive();
	}
}