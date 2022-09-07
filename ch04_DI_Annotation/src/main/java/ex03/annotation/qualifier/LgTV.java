package ex03.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	//Speaker speaker = new SonySpeaker();
	
	@Autowired
	@Qualifier("apple")
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
