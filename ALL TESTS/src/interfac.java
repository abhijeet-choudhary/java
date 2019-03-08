interface yoyo{
	int i=2;
	void display();
}
public class interfac implements yoyo{

	public void display(){
		System.out.println("This is what happens "+i+" everybody");
	}
	public static void main(String[] args) {
		yoyo t= new interfac();
		interfac i = new interfac();
		i.display();
		t.display();

	}

}
