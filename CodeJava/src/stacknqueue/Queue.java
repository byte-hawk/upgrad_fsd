package stacknqueue;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Integer> elements;

    public Queue(){
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
    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is already empty!");
        }
        int front = elements.get(0);
        elements.remove(0);
        return front;
    }
}
