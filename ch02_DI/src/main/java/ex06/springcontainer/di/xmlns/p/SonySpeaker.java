package ex06.springcontainer.di.xmlns.p;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("SonySpeaker 객체 생성.");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker---volumeUp.");
	}

	public void volumeDown() {
		System.out.println("SonySpeaker---volumeDown.");
	}
}
