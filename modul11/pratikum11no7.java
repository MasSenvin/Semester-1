package modul11;

import java.util.Arrays;

public class pratikum11no7 {
    public static void main(String[] args) {
         int[] Bilangan = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};

        System.out.println("Array Sebelum Diurutkan: " + Arrays.toString(Bilangan));

        sort(Bilangan);

        System.out.println("Array Sesudah Diurutkan: " + Arrays.toString(Bilangan));
    }

    public static void sort(int[] list) {
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
 