package ex02.annotation.autowired;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	//Speaker speaker = new SonySpeaker();
	
	//@Autowired  //@Inject와 똑같은 동작을 함.
	@Inject
	Speaker speaker;
	
	
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

		//System.out.println("LgTV volume Up.");
		speaker.volumeUp();
	}

	public void volumeDown() {

		//System.out.println("LgTV volume Down.");
		speaker.volumeDown();
		
	}

}
