package lesson_3;
// 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
// ["string", "s", "my_value"]

import java.util.ArrayList;
import java.util.List;
public class HW3_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "6", "hello", "s", "5", "10", "-12", "my_value"));
        ArrayList<String> list_new = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            boolean isNum = true;
            isNum = (list.get(i)).matches("-?\\d+");
            if (!isNum ) {

                list_new.add(list.get(i));
            }
        }
        System.out.println(list_new);
    }
}
