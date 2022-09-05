package ex05.springcontainer.di.setter;

public class LgTV implements TV {

	Speaker speaker;
	int price;

	public LgTV() {

	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
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
