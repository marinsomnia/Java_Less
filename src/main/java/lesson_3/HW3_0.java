package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
public class HW3_0 {
    public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 2, 14, 34, 70, 27, 20, 5 ,11, 56, 6, 17, 100));
    evenNumbers(integers);
    System.out.println(integers);
}
    private static void evenNumbers(List<Integer> source) {
        int i = 0;
        while (i < source.size()) {

            if (source.get(i) % 2 != 0) {
                source.remove(i--);
            }
            i++;
        }
    }
}
