
public class wrappercl {

	void autobox(){
		int a = 5;
		Integer i = Integer.valueOf(a);  //explicitly
		Integer j= a;                    //autoboxing
		System.out.println("Autoboxing: "+a+" "+i+" "+j);
	}
	void unbox(){
		Integer i = new Integer(5);
		int a = i.intValue();        //explicitly
		int b = i;                   //unboxing
		System.out.println("Unboxing: "+i+" "+a+" "+b);
		
	}
	public static void main(String[] args) {
		wrappercl w = new wrappercl();
		w.autobox();
		w.unbox();
	}

}
