package Pertemuan2;

public class Node {
	private int nilai;
	private Node next;
	
	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	// inisialisasi code
	public Node(int nilai) {
			this.nilai = nilai;
	}
}
