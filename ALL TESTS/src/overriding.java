class test{
	int r=2;
	void tooto(){
		 r=r+r;
		 System.out.println(r);
	}
}
class test2 extends test{
	void tooto(){
		System.out.println("ping");
	}
	void tea(){
		super.tooto();
	}
}
public class overriding {
	void tooto(){
		System.out.println(6);
	}

	public static void main(String[] args) {
		test2 s =new test2();
		s.tea();
		System.out.println(s instanceof test);

	}

}
