package lesson_5;

import java.util.*;
/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

public class HW5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input sentence: ");
        String sentence = scan.nextLine();
        collectStats(sentence);
    }
    static void collectStats(String text) {
        Map<Integer, List<String>> stats = new HashMap<>();
        ArrayList<Integer> numList = new ArrayList<>();
        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++) {
            numList.add(parts[i].length());
        }
        for (int i = 0; i < numList.size() ; i++) {
            ArrayList<String> words = new ArrayList<>();
            for (int j = 0; j < parts.length; j++) {
                if (parts[j].length() == numList.get(i)) {
                    words.add(parts[j]);
                }
            }
            stats.put(numList.get(i), words);
        }
        for (var item: stats.values()) {
            for (int i = 0; i < item.size(); i++) {
                System.out.print(item.get(i) + " ");
            }
            System.out.println();
        }
    }
}
