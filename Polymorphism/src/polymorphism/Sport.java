package polymorphism;

public class Sport {
	public void play() {
		System.out.println("Playing Sports");
	}

	public static void main(String[] args) {
		Sport s=new Sport();
		s.play();
		Sport s1=new football();
		s1.play();
		Sport s2=new cricket();
		s2.play();
		Sport s3=new hockey();
		s3.play();
	}

}
class football extends Sport{
	public void play() {
		System.out.println("Playing Football");
	}
}
class cricket extends Sport{
	public void play() {
		System.out.println("Playing Cricket");
	}
}
class hockey extends Sport{
	public void play() {
		System.out.println("Playing Hockey");
	}
}
