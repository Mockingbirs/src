package ex04.annotation.resource;

import org.springframework.stereotype.Component;

@Component("apple")
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
