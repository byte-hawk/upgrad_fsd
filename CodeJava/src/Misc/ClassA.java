package Misc;

import java.util.ArrayList;
import java.util.List;

public class ClassA {

    private List<Integer> list1 = new ArrayList<>();

    public ClassA(){
        list1.add(1);
        list1.add(2);
    }

    public List<Integer> getList1() {
        return list1;
    }
}
