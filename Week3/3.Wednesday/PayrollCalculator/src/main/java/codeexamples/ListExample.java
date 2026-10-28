package codeexamples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();

        groceryList.add("Peanut Butter");
        groceryList.add("Orange Juice");
        groceryList.add("Grapes");

        groceryList.remove("Orange Juice");

        for(String item : groceryList){
            System.out.println(item);
        }
    }
}
