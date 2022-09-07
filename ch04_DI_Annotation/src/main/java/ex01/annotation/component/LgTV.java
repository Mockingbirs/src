package ex01.annotation.component;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {


	public LgTV() {
		System.out.println("LgTV 객체 생성.");

	}


	public void powerOn() {

		System.out.println("LgTV power On.");

	}

	public void powerOff() {

		System.out.println("LgTV power Off.");
	}

	public void volumeUp() {

		System.out.println("LgTV volume Up.");
	}

	public void volumeDown() {

		System.out.println("LgTV volume Down.");
	}

}
