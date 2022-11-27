
public class carClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car car1 = new car();
		car1.brand="Fiat";
		car1.model="500";
		car1.amountOfFuel=10;
		
		car1.printData();
		car1.brake();
		car1.accelerate();
		car1.printData();
		
		car car2 = new car("Toyota", "Fortuner", 10);
		car2.printData();
	}
	

}
//Car Class
class car
{
	String brand;
	String model;
	int amountOfFuel = 10;
	
	//default
		public car()
		{
			brand="";
			model="";
			amountOfFuel=0;
		}
		//parametized
		public car(String Branding, String Modeling, int Fuel)
		{
			brand=Branding;
			model=Modeling;
			amountOfFuel=Fuel;
		}
	
	
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