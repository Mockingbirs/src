package ex06.springcontainer.di.xmlns.p;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성.");
	}

	public void volumeUp() {
		System.out.println("AppleSpeaker---volumeUp.");
	}

	public void volumeDown() {
		System.out.println("AppleSpeaker---volumeDown.");
	}
}
