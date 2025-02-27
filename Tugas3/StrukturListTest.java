
package Tugas3;

public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(4.5);
		list.addTail(3.4);
		list.addHead(2.1);
		
		System.out.println("Elemen: ");
		list.displayElement ();
		
		StrukturList list2 = new StrukturList();
		list2.addTail(5.5);
		list2.addmid(2.1, 1);
		list2.addmid(1.1, 2);
		list2.addmid(4.5, 3);
		list2.addHead(3.5);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Elemen: ");
		list2.displayElement();
	}
}

