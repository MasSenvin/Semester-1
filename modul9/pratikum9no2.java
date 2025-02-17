package modul9;

import java.util.Scanner;

public class pratikum9no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia maksimal: ");
        int maxUsia = scanner.nextInt();

        System.out.print("Masukkan jumlah penduduk (N): ");
        int n = scanner.nextInt();

        System.out.println("Diagram Batang Mendatar dari Data Usia Penduduk:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " - " + ((i + 1) * 20) + "\t: ");
            
            // Menampilkan bintang (*) sesuai dengan jumlah penduduk
            for (int j = 0; j < ((i + 1) * 20) && j < maxUsia; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}
    

