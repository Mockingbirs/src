package ex05.springcontainer.di.setter;

public class LgTV implements TV {

	Speaker speaker;
	int price;

	public LgTV() {

	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 메서드 호출.");
		this.speaker = speaker;
	}
	
	

	public void setPrice(int price) {
		System.out.println("setPrice() 메서드 호출.");

		this.price = price;
		
		System.out.println( "price : "+this.price +"원");
	}

	public void powerOn() {

		System.out.println("LgTV power On.");

	}

	public void powerOff() {

		System.out.println("LgTV power Off.");
	}

	public void volumeUp() {

		speaker.volumeUp();
	}

	public void volumeDown() {

		speaker.volumeDown();
	}

}
