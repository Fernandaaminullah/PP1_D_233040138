
package Tugas3;


public class Node {
	private double nilai;
	Node next;
	
	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	// inisialisasi code
	public Node(double nilai) {
			this.nilai = nilai;
	}
}


