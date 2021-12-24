package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALDemo {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        numbers.add(2);
        numbers.add(8);
        numbers.add(-2);

        // Time complexity: O(n log n)
        Collections.sort(numbers, Collections.reverseOrder());

        // foreach method
        numbers.forEach(n -> System.out.print(n+","));
        System.out.println();

        // numbers.size() is arraylist equivalent of numbers.length in array
        // for loop
        for(int i=0; i<numbers.size(); i++)
        {
            System.out.print(numbers.get(i)+","); // numbers.get(i) is arraylist equivalent of numbers[i] in array
        }
        System.out.println();

        // foreach loop
        for(Integer n : numbers){
            System.out.print(n+",");
        }
    }
}
