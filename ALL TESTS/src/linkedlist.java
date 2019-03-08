class Node{
	int data;
	Node next;
}
public class linkedlist {
	Node head;
	
	public void insert(int data){
		Node node= new Node();
		Node.data= data;
		if (head==null){
			head=node;
			head.next=null;
		}else{
			Node n=head;
			for(;n!=null;n=n.next){
				
			}n.next=node;	
		}
	}
	public void show(){
		Node node= head;
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
		}//System.out.println(node.data);
	}

	public static void main(String[] args) {
		linkedlist lk= new linkedlist();
		lk.insert(55);
		lk.insert(12);
		lk.insert(21);
		lk.insert(99);
		lk.show();

	}

}
