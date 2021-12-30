package Lists;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            next = null;
            prev = null;
        }
    }

    public DoublyLinkedList(){
         this.head = null;
         this.tail = null;
    }

    // Time Complexity: O(1)
    public void append(int val){
         // Create a new node
        Node newNode = new Node(val);

        // If the list is empty
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
    }

    // Time complexity: O(n)
    // Traverse the list and print each element in the order
    public void printList(){
        // Traverse the list
        Node temp = head;
        if(head != null) {
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    // Time complexity: O(1)
    public void deleteFromEnd() throws Exception {
        if(head == null){
            throw new Exception("List is already empty");
        }
        if(head.next == null){
            head = null;
            tail = null;
        }
        else{
            Node secondLastNode = tail.prev;
            secondLastNode.next = null;
            tail = secondLastNode;
        }
    }

    // Time complexity: O(1)
    public boolean isEmpty(){
        return head == null;
    }

    public void insertAtPos(int data, int pos) {

        Node newNode = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid");
        } else if (pos == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node temp = head, previous = null;
            int i = 1;
            while (i < pos) {
                previous = temp;
                temp = temp.next;
                i++;
            }

            previous.next = newNode;
            newNode.prev = previous;

            newNode.next = temp;
            if(temp != null) {
                temp.prev = newNode;
            }
            else{
                tail = newNode;
            }
        }
    }
}