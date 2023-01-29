package logical;

public class Sample implements Interface1, Intrface2{
	public void m1() {
		System.out.println("HI i am m1");
	}

	@Override
	public void m3() {
		System.out.println("HI i am m3");
		
	}

	@Override
	public void m4() {
		System.out.println("HI i am m4");
		
	}

	@Override
	public void m2() {
		System.out.println("HI i am m2");
		
	}

}
