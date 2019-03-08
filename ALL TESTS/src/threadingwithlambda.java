
public class threadingwithlambda implements Runnable{

	public static void main(String[] args) {
		
		Thread t1= new Thread(()->{
			
				for(int i=1; i<6;i++){
					System.out.println("hi");
					try{Thread.sleep(500);}catch(Exception e){}
				}
		
			});
		Thread t2= new Thread(()->{
			
				for(int i=1; i<6;i++){
					System.out.println("hello");
					try{Thread.sleep(500);}catch(Exception e){}
				}
		
			});
		
		t1.start();
		try{Thread.sleep(5);}catch(Exception e){}
		t2.start();

	}
	public void run(){}

}
/*class hi implements Runnable{
	public void run(){
		for(int i=1; i<6;i++){
			System.out.println("hi");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class hello implements Runnable{
	public void run(){
		for(int i=1; i<6;i++){
			System.out.println("hello");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}*/