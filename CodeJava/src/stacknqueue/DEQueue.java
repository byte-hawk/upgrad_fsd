package stacknqueue;

import java.util.ArrayList;
import java.util.List;

public class DEQueue {

    private List<Integer> elements;

    public DEQueue(){
        elements = new ArrayList<>();
    }

    // Time Complexity: O(1)
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    // Time Complexity: O(1)
    public void enqueue(int data){
        elements.add(data);
    }

    // Time Complexity: O(1)
    public void prepend(int data){
        elements.add(0,data);
    }

    // Time Complexity: O(1)
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is already empty!");
        }
        int front = elements.get(0);
        elements.remove(0);
        return front;
    }

    // Time Complexity: O(1)
    public int deleteFromEnd() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is already empty!");
        }

        int rear = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return rear;
    }
}
