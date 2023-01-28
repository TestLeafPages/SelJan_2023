package week3.day1;

public class SmartPhone extends AndroidPhone{

	
	public void connectWhatsApp() {
		System.out.println("WhatsAPP");
	}
	
	@Override
	public void takeVideo() {
		System.out.println("Take video from Smart Phone");
	}

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.connectWhatsApp();
		phone.takeVideo();
		phone.makeCall();
		phone.sendMsg();
	}
}
