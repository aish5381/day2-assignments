public class Television{

	boolean currentState;
	int currentVolume;
	int currentChannel;

	public Television(boolean currentState,int currentVolume,int currentChannel)
	{
	this.currentState=currentState;
	this.currentVolume=currentVolume;
	this.currentChannel=currentChannel;
	}

	public void displayStatus(){
	System.out.println("The TV is "+currentState);
	System.out.println("The current volume is "+currentVolume);
	System.out.println("The current channel is "+currentChannel);
	}

	public void changeVolume(String volumeInput){
		if(volumeInput.equals("inc")){
		int count=this.currentVolume;
		count++;
		this.currentVolume=count;
		System.out.println("Volume increased to "+this.currentVolume);
		}

		else if(volumeInput.equals("dec")){
		int count=this.currentVolume;
		count--;
		this.currentVolume=count;
		System.out.println("Volume decreased to "+this.currentVolume);
		}

		else{
		System.out.println("Please choose correct option");
		}
	}

	public void decreaseVolume(){
		
	}
	public void changeChannel(String channelInput){
		if(channelInput.equals("inc")){
		int count=this.currentChannel;
		count++;
		this.currentChannel=count;
		System.out.println("Volume decreased to "+this.currentChannel);
		}

		else if(channelInput.equals("dec")){
		int count=this.currentChannel;
		count--;
		this.currentChannel=count;
		System.out.println("Volume decreased to "+this.currentChannel);
		}

		else{
		System.out.println("Please choose correct option");
		}
		
	}

	public void changeState(){
		boolean state=this.currentState;
		if(state==true){
		state=false;
		System.out.println("Turning TV off......");
		}
		else{
		state=true;
		System.out.println("Tv is ON");
		}
	}
}