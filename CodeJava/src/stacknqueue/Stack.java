package stacknqueue;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> elements;

    public Stack(){
        elements = new ArrayList<>();
    }

    // Time Complexity: O(1)
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    // Time Complexity: O(1)
    public void push(int data){
        elements.add(data);
    }

    // Time Complexity: O(1)
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is already empty!");
        }
        return elements.get(elements.size() - 1);
    }

    // Time Complexity: O(1)
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is already empty!");
        }
        int lastIndex = elements.size() - 1;
        int last = elements.get(lastIndex);
        elements.remove(lastIndex);
        return last;
    }
}
