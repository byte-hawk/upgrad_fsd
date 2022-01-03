package Lists;

public class SinglyLinkedList2 {

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    // Time Complexity: O(n)
    // Return the head node's reference of the list
    public static Node append(Node head, int val){
         // Create a new node
        Node newNode = new Node(val);

        // If the list is empty
        if(head == null){
            head = newNode;
        }
        else{
            // Get the last node
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            // Update last node's next pointer to the new node
            temp.next = newNode;
        }

        return head;
    }

    // Time complexity: O(n)
    // Traverse the list and print each element in the order
    public static void printList(Node head){
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

    // Time complexity: O(n)
    public static Node deleteFromEnd(Node head) throws Exception {
        if(head == null){
            throw new Exception("List is already empty");
        }
        if(head.next == null){
            head = null;
        }
        else{
            // Get the second last node
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            // update the next pointer of second last element to null
            temp.next = null;
        }

        return head;
    }

    // Time complexity: O(1)
    public boolean isEmpty(Node head){
        return head == null;
    }

    public static void insertAtPos(Node head, int data, int pos) {

        Node newNode = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid");
        } else if (pos == 1) {
            newNode.next = head;
        } else {
            Node temp = head;
            Node previous = null;
            int i = 1;
            while (i < pos) {
                previous = temp;
                temp = temp.next;
                i++;
            }
            previous.next = newNode;
            newNode.next = temp;
        }
    }

    public static void main(String[] args){
        Node head = null;

        head = append(head, 2);
        head = append(head, 23);
        head = append(head, 9);
        head = append(head, 17);

        printList(head);
    }
}