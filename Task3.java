package HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 3. Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        // а остальные - равны ему.
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(10);
            array[i] = number;
        }
        System.out.print(Arrays.toString(array));
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите число от 0 до 9: ");
        int number = scan.nextInt();
        scan.close();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                array[count] = array[i];
                count++;
            }
        }
        for (int i = count; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}
