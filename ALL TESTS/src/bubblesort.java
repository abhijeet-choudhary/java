
public class bubblesort {
	static void show(){
		
	}

	public static void main(String[] args) {
		int temp=0;
		int[] ss = {55,99,21,75,98,99,1,12,86,9};
		for(int k=0;k<ss.length;k++){
		for (int i=0;i<ss.length-1;i++){
		//if(i!=ss.length){	
			if (ss[i]>ss[i+1]){
				temp=ss[i];
				ss[i]=ss[i+1];
				ss[i+1]=temp;
			}
		}}
		for(int j=0;j<ss.length;j++)
			System.out.println(ss[j]);

	}

}
