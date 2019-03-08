
public class tostring {

	int roll;
	String s;
	
	tostring(int roll,String s){
		this.roll=roll;
		this.s= s;
	}
	public String toString(){
		return roll+" "+s;
	}
	public static void main(String[] args) {
		tostring ts= new tostring(55,"hi");
		System.out.println(ts);

	}

}
