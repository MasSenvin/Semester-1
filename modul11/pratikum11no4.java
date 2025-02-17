package modul11;

import java.util.Scanner;

public class pratikum11no4 {
    public static void main(String[] args) {
        int[] a = {2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78};
        int find;
        boolean condition = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Nilai yang dicari: ");
        find = input.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == find) {
                System.out.println("Nilai " + find + " Berada di Index: " + i);
                condition = true;
                break; 
            }
        }

        if (!condition) {
            System.out.println("Nilai " + find + " Tidak Ditemukan.");
        }
        input.close();
    }
}
        


    
