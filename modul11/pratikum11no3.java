package modul11;

import java.util.Scanner;

public class pratikum11no3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Array: ");
        int panjang = input.nextInt();

        double[] skor = new double[panjang];

        System.out.println("Masukkan Data Bulat");

        for (int i = 0; i < skor.length; i++) {
            System.out.print("Data ke " + (i + 1) + ": ");
            skor[i] = input.nextDouble();
        }

        double min = skor[0];
        double max = skor[0];
        double jumlah = 0;

        System.out.println("Skor Array: ");

        for (int i = 0; i < skor.length; i++) {
            System.out.println("Index " + i + " Adalah " + skor[i]);

            jumlah += skor[i];

            if (skor[i] < min) {
                min = skor[i];
            }

            if (skor[i] > max) {
                max = skor[i];
            }
        }

        double rataRata = jumlah / skor.length;

        System.out.println("");
        System.out.println("Jumlah Nilai : " + jumlah);
        System.out.println("Nilai Rata Rata: " + rataRata);
        System.out.println("Nilai Minimal: " + min);
        System.out.println("Nilai Maximal: " + max);

        input.close();

    }
    
}
