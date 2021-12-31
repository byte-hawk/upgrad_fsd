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

    public void prepend(int data){
        
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

    public int deleteFromEnd(){

    }
}
