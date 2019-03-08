
public class overloading {
	void display(){
		System.out.println(" something");
	}
	
	void display(double i){
		System.out.print((i*i));
	}

	public static void main(String[] args) {
		overloading ov = new overloading();
		
		ov.display(4.5);
		ov.display();

	}

}
