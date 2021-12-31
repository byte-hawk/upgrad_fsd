package stacknqueue;

public class QueueDriver {

    public static void main(String[] args) throws Exception {

        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.enqueue(3);
        q.enqueue(8);
        q.enqueue(12);
        q.enqueue(25);
        q.enqueue(98);
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
