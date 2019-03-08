
public class comparison {

	public static void main(String[] args) {
		String s1= "hello ";
		String s2= "now ";
		String s3= "yo ";
		char ch[]={'n','o','w'};
		String y= new String(ch);
		System.out.println("equals method "+s1.equals(ch));
		System.out.println("equals method "+ s2.equals(y));
		System.out.println("compare to method "+s2.compareTo(y));
		System.out.println("== operator"+s2==y);
//-----------------------------------------------------------------------------------

		s3=s3.concat(s2);
		System.out.println(s3.concat("yo"));// difference between var.concat() & var= var.concat();
		y=y+s1+s2+s3;
		System.out.println(y);


	}

}
