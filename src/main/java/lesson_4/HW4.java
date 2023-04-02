package lesson_4;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
// num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке.
// 3. Если введено exit, завершаем программу

// Пример:
// string~4
// num~3
// print~3
// > num
// print~4
// > string
// my_value~1
// print~1
// > my_value

import java.util.ArrayList;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        ArrayList<String> textList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] parts = input.split("~");
            if (parts.length != 2) {
                System.out.println("Invalid input. Input should be in the format 'text~num'.");
                continue;
            }
            String text = parts[0];
            String numString = parts[1];
            int num;
            try {
                num = Integer.parseInt(numString);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. 'num' should be an integer.");
                continue;
            }
            if (text.equals("print")) {
                if (num >= 0 && num < textList.size()) {
                    System.out.println(textList.get(num));
                } else {
                    System.out.println("Invalid index.");
                }
            } else {
                if (num >= 0) {
                    while (textList.size() <= num) {
                        textList.add(null);
                    }
                    textList.set(num, text);
                } else {
                    System.out.println("Invalid index.");
                }
            }
        }
    }
}
