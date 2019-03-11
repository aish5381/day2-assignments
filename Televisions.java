import java.util.Scanner;

public class Televisions{
	

	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	String volumeInput;
	String channelInput;

	Television television=new Television(true,10,101);
	television.displayStatus();
	
	System.out.println("Please enter inc or dec for increasing or decreasing volume");
	volumeInput=scanner.next();
	television.changeVolume(volumeInput);

	System.out.println("Please enter inc or dec for increasing or decreasing channel");
	channelInput=scanner.next();
	television.changeChannel(channelInput);

	television.displayStatus();
	television.changeState();
	}
}