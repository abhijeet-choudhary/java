abstract class compny{
	int id;
	//String name="yo";
	void setter(int id){
		this.id = id;
	}
	public abstract void display();
}

class emp extends compny{
	public void display(){
		System.out.println("employee ID: "+id);
	}
}


public class abstractclass extends compny{

	public void display(){}
	public static void main(String[] args) {
		emp e= new emp();
		e.setter(55);
		e.display();
	}

}
