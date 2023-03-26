package lesson_2;

import java.util.Scanner;
public class HW2_0 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first symbol: ");
        String c1 = scan.nextLine();
        System.out.print("Input the second symbol: ");
        String c2 = scan.nextLine();
        System.out.print("Input N : ");
        int n = scan.nextInt();
        System.out.println(buildString(n, c1, c2));

    }

    static String buildString(int len, String sym1, String sym2) {
        String symbols = sym1 + sym2;
        String result = symbols.repeat(len / 2);
        return result;
    }
}
