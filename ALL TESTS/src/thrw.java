
public class thrw {
	
	void sanit(){
		
		for(int i=1;i<20;i++){
			System.out.println(i);
		try{
			
		if(i==10){
			throw new AbhijeetException("i is equal to 10");
			
		}
		}catch(AbhijeetException e){
			System.out.println(e);
			i=11;
			e.printStackTrace();
		}
		}
		
	}

	public static void main(String[] args) throws AbhijeetException {
		thrw th = new thrw();
		
		th.sanit();
		
		
		

	}

}
