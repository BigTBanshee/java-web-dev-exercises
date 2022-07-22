package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String [] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }


}
