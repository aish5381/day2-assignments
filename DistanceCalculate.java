public class DistanceCalculate{

	public static void main(String[] args){

	Distance distance2=new Distance();
	Distance distance3=new Distance();
	
	distance2.setDistanceValues(3,9.0f);
	distance3.setDistanceValues(4,8.4f);

	distance2.displayDistanceValues();
	distance3.displayDistanceValues();


	Distance distance4;
	distance4=distance2.distanceAdd(distance3);
	
	distance4.displayDistanceValues();
	}
}