package ex05.annotation.resource.xml.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	//Speaker speaker = new SonySpeaker();
	
	/*  //@Autowired  @Qualifier 을 한번에 사용할 수 있는 코드 @Resource(name = "ID값")
	 * @Autowired
	 * 
	 * @Qualifier("apple")
	 */
	
	//@Resource(name = "apple")
	@Autowired
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
