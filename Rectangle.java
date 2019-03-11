public class Rectangle{

	private double length;
	private double breadth;

	public void setLengthAndBreadth(double length,double breadth){
	this.length=length;
	this.breadth=breadth;
	}

	public void displayLengthAndBreadth()
	{
	
	System.out.println("Length of reactangle is "+length+" and breadth is "+breadth);
	}

	public double area()
	{
	return length*breadth;
	}

	public double perimeter()
	{
	return 2*(length+breadth);
	}

	public void compareAreaAndPerimeter(Rectangle r, Rectangle r1)
	{
	if(r.area()==r1.area())
	{
	System.out.println("Area of rectangle is same");
	}
	else{
	System.out.println("Area is different");
	}
	}		

}