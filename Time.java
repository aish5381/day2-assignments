public class Time{
	
	private int hours;
	private int minutes;
	
	public void setTime(int hours,int minutes){
	this.hours=hours;
	this.minutes=minutes;	
	}

	public void displayTime(){
	System.out.println("Time is "+hours+" hours and "+minutes+" minutes");
	}

	public Time sumTime(Time time)
	{
	Time time1=new Time();
	time1.hours=this.hours+time.hours;
	time1.minutes=this.minutes+time.minutes;
	return time1;
	}
}
	
