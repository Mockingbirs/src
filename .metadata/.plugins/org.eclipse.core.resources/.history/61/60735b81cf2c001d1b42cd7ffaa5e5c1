package ex04.springcontainer.di.constructor;

public class LgTV implements TV {
	//SonySpeaker speaker;
	//AppleSpeaker speaker;
	Speaker speaker;
	int price;

	public LgTV() {
		// speaker = new SonySpeaker();
	}

	//public LgTV(SonySpeaker speaker) {
	public LgTV(Speaker speaker) {
		// speaker = new SonySpeaker();
		this.speaker = speaker;
	}

	//public LgTV(SonySpeaker speaker, int price) {
		public LgTV(Speaker speaker, int price) {
		// speaker = new SonySpeaker();
		this.speaker = speaker;
		this.price = price;
		System.out.println("price : "+this.price+"원");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV power On.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV power Off.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		// System.out.println("LgTV volume Up.");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		// System.out.println("LgTV volume Down.");
		speaker.volumeDown();
	}

}
