
public class Abstract extends abstractclasss {

	@Override
	void m1() {

		System.out.println("Dont sing a song");

	}

	public static void main(String[] args) {

		abstractclasss a = new Abstract();
		a.singsong();
		a.m1();
	}
}
