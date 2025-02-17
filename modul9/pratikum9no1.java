package modul9;

import java.util.Scanner;

public class pratikum9no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N untuk matriks identitas N x N: ");
        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Diagonal utama bernilai 1, elemen lainnya bernilai 0
                if (i == j) {
                    System.out.print("1\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

    

