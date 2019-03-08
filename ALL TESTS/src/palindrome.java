import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int num,aa,rev=0;
		System.out.println("Enter a number ");
		num= new Scanner(System.in).nextInt();
		int temp=num;
		
		while(temp>0){
			aa=temp%10;
			rev= rev*10 +aa;
			temp=temp/10;
		}
		System.out.println(rev);

		if(rev == num){
			System.out.println("It is palindrome");
		}
		else{
			System.out.println("It is not palindrome");
		}
	}

}
