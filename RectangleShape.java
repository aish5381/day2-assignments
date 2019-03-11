public class RectangleShape{

	public static void main(String[] args){
	
	Rectangle rectangle = new Rectangle();
	Rectangle rectangle1 = new Rectangle();
	Rectangle rectangle3 = new Rectangle();

	rectangle.setLengthAndBreadth(2.0,3.0);
	rectangle1.setLengthAndBreadth(2.0,7.0);

	rectangle.displayLengthAndBreadth();
	rectangle1.displayLengthAndBreadth();
	
	System.out.println("Area of rectangle is "+rectangle.area());
	System.out.println("Perimeter of rectangle is "+rectangle.perimeter());

	System.out.println("Area of rectangle is "+rectangle1.area());
	System.out.println("Perimeter of rectangle is "+rectangle1.perimeter());

	rectangle3.compareAreaAndPerimeter(rectangle,rectangle1);

	}





}