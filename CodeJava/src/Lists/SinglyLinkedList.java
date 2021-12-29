package Lists;

public class SinglyLinkedList {

    public Node head;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    public SinglyLinkedList(){
         this.head = null;
    }

    // Time Complexity: O(n)
    // Return the head node's reference of the list
    public Node append(int val){
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

    // Time complexity: O(n)
    public Node deleteFromEnd() throws Exception {
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
    public boolean isEmpty(){
        return head == null;
    }

}