package HomeWork1;

import java.util.Arrays;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            array[i] = number;
        }
        System.out.printf(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int j : array) {

            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }

        }
        System.out.printf("\nМаксимальный элемент равен %s", max);
        System.out.printf("\nМинимальный элемент равен %s", min);
    }
}

