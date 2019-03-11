public class TimeCalculate{

	public static void main(String[] args){

	Time time2=new Time();
	Time time3=new Time();
	Time time4;

	time2.setTime(12,10);
	time3.setTime(3,7);
	
	time2.displayTime();
	time3.displayTime();

	time4=time2.sumTime(time3);
	time4.displayTime();
	}
}