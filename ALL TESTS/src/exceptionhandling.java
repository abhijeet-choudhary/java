
public class exceptionhandling {

	public static void main(String[] args) {
		try{
			String s = null;
			System.out.println("hi"+s.length());
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("yo");
		}
		/*finally{
		System.out.println("yo");
		}*/
		
	}

}
