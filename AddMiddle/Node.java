
package Pertemuan4;

import Pertemuan4.Node;

public class Node {
	private int nilai;
	Node next;
	
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

