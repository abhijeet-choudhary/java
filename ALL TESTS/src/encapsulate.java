class helper{
	private String name;
	public String getter(){
		return name;
	}
	public void setter(String name){
		this.name= name;
	}
}
public class encapsulate {

	public static void main(String[] args) {
		helper h = new helper();
		h.setter("Abhijeet");
		System.out.println(h.getter());

	}

}
