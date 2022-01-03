package Lists;

public class DLLDriver {

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(2);
        dll.append(23);
        dll.append(9);
        dll.append(17);
        dll.printList();
        dll.insertAtPos(15, 5);
        dll.printList();
    }
}
