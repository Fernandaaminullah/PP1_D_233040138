package Pertemuan8;

public class StrukturQueue {    

    private Node FRONT = null;
    private Node REAR = null;

    public boolean isEmpty() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode; 
            }
        }
        public int size () { 
        	int size = 0;
        	Node curNode = FRONT;
        	while (curNode != null) {
        		size++;
        		curNode = curNode.getNext();
        	}
        	return size ; 
        }
        	
        	public int front() {
        		return FRONT != null ? FRONT.getNilai() : -1;
        	}
        	
        	public void displayElements() {
        	    if (isEmpty()) {
        	        System.out.println("Elemen Queue: Queue kosong");
        	    } else {
        	        System.out.print("Elemen Queue: ");
        	        Node current = FRONT;
        	        while (current != null) {
        	            System.out.print(current.getNilai() + " ");
        	            current = current.getNext();
        	        }
        	        System.out.println();
        	    }
        	}
        	
        public int dequeue () {
        	if (FRONT != null) {
        		if (FRONT == REAR) {
        			FRONT = null;
        			REAR = null;
        		} else {
        			Node temp = FRONT;
        			FRONT = FRONT.next;
        			temp.next = null;
        		}
        	}
        	return 0;
        }
     }




