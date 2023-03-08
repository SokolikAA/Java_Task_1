package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean
        // (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        // кроме каждого 100-го, при этом каждый 400-й – високосный.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите год в формате ХХХХ: ");
        int year = scan.nextInt();
        scan.close();
        System.out.println(checkYear(year));
    }

    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
