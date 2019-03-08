
public class recursion {

	int i =1;int t;int j=1;
	void fivetable(){
		
		
		if(i<=10){

			t=i*j;
			
			System.out.println("5X"+i+"="+t);
			i++;
			fivetable();
			
		}
		else{
			
		}
	}
	public static void main(String[] args) {
		recursion r = new recursion();
		r.fivetable();

	}

}
