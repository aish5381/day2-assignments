public class Distance{

	private int feet;
	private float inches;

	public void setDistanceValues(int feet,float inches)
	{
	this.feet=feet;
	this.inches=inches;
	}

	public void displayDistanceValues()
	{
	System.out.println("Value of distance is "+feet+" feets and "+inches+" inches");
	}

	public Distance distanceAdd(Distance distance)
	{
	Distance distance1=new Distance();
	distance1.feet=this.feet+distance.feet;
	distance1.inches=this.inches+distance.inches;
	return distance1;
	}
}

	