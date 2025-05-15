package Pertemuan8;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);

        System.out.println("\n### Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());
        
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        // Enqueue 4 data
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("\n### Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
        
        StrukturQueue queue2 = new StrukturQueue();

        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue2.size());
        System.out.println("isEmpty: " + queue2.isEmpty());
        queue2.displayElements();

        System.out.println("\n### Enqueue 4x ###");
        queue2.enqueue(2);
        queue2.enqueue(7);
        queue2.enqueue(6);
        queue2.enqueue(1);

        System.out.println("size: " + queue2.size());
        System.out.println("isEmpty: " + queue2.isEmpty());
        queue2.displayElements();
        System.out.println("Front: " + queue2.front());

        System.out.println("\n### Dequeue 2x ###");
        queue2.dequeue(); // menghapus 2
        queue2.dequeue(); // menghapus 7

        System.out.println("size: " + queue2.size());
        System.out.println("isEmpty: " + queue2.isEmpty());
        queue2.displayElements();
        System.out.println("Front: " + queue2.front());

    }
 }


