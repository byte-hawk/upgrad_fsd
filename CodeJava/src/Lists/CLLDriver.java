package Lists;

public class CLLDriver {
    public static void main(String[] args) throws Exception {
        CircularLinkedList cll = new CircularLinkedList();
        cll.printList();
        cll.append(2);
        cll.append(23);
        cll.append(9);
        cll.append(17);
        cll.printList();
    }
}
