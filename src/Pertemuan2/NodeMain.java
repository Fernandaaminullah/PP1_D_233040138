package Pertemuan2;

public class NodeMain {
	public static void main (String[] args) {
		//membuat 2 buah node n1 & n2
		Node n1 = new Node (5);
		Node n2 = new Node (7);
		
		Node n3 = new Node (9);
		Node n4 = new Node (8);
		
		Node n5 = new Node (2);
		Node n6 = new Node (3);
		
		//membuat relasi Node n1 & n2
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n5.setNext(n6);
		n6.setNext(n1);
		
		//menampilkan Node n1 & n2 dengan pointer p 
		Node p = n1;
		Node p1 = n5;
		while (p != null)
		{
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
	System.out.println("");
	while (p1 !=n4)
	{
		System.out.printf("%d ",p1.getNilai());
		p1 = p1.getNext();
	}
	}
}