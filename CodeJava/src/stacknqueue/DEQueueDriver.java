package stacknqueue;

public class DEQueueDriver {

    public static void main(String[] args) throws Exception {
        DEQueue dq = new DEQueue();

        System.out.println(dq.isEmpty()); // true
        dq.enqueue(3);
        dq.enqueue(8);
        dq.enqueue(12);

        dq.prepend(25);
        dq.prepend(98);

        System.out.println(dq.isEmpty()); // false
        // 98 -> 25 -> 3 -> 8 -> 12

        System.out.println(dq.dequeue()); // 98
        System.out.println(dq.dequeue()); // 25
        System.out.println(dq.dequeue()); // 3

        System.out.println(dq.deleteFromEnd()); // 12
        System.out.println(dq.deleteFromEnd()); // 8

        System.out.println(dq.isEmpty()); // true
    }
}
