
public class carClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car car1 = new car();
		car1.brand="Fiat";
		car1.model="500";
		car1.amountOfFuel=10;
	}
	

}
//Car Class
class car
{
	String brand;
	String model;
	int amountOfFuel = 10;
	
	
	public void brand()
	{
		brand ="";
	}
	public void model()
	{
		model = "";
	}
	public void amountOfFuel()
	{
		amountOfFuel=10;
	}
	
	public void brake()
	{
		System.out.println("The car is braking");
	}
	public void accelerate()
	{
		if (amountOfFuel >0)
		{
		System.out.println("Car is accelerating");
		amountOfFuel = (amountOfFuel-1);
		}
		else
		{
			System.out.println("");
		}
	}
	public void printData()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(amountOfFuel);
	}
	public void refuel(int amount)
	{
		amountOfFuel = (amountOfFuel + amount);
	}
	
}