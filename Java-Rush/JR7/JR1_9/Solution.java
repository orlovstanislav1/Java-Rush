package JR7.JR1_9;

/*
Что за список такой
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "q");
        list.add(1, "w");
        list.add(2, "e");
        list.add(3, "r");
        list.add(4, "t");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
