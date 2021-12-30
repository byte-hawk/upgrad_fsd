package Lists;

public class SLLDriver {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList sll = new SinglyLinkedList();
        System.out.println(sll.isEmpty());
        sll.printList();
        sll.append(2);
        sll.append(23);
        sll.append(9);
        sll.append(17);
        sll.printList();

        sll.deleteFromEnd();
        sll.printList();
        System.out.println(sll.isEmpty());

        sll.insertAtPos(15, 3);

    }
}
