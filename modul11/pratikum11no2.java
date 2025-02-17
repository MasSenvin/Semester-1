package modul11;

import java.util.Scanner;

public class pratikum11no2 {
    public static void main(String[] args) {
                int[] skor;
        skor = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            skor[i] = Keyboard.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        for(int i=0; i <= 4; i++) System.out.println("Data ke "+ (i+1) +" adalah "+skor[4-i]);

        int sum = 0;

       for(int i = 0;i<5;i++){
        sum = sum + skor[i];
       }
       double hasilSum = (double) sum / 5;
       System.out.println("ratarata " + hasilSum);
       int max = skor[0];
       int min = skor [0];

       for(int i = 0; i < 5; i++){
          if (skor[i] > max) {
            max = skor[i];
        }
          if (skor[i] < min) {
            min = skor[i];
            
        }

       }
        System.out.println("Nilai Max " + max);
        System.out.println("Nilai min " + min);
       
      Keyboard.close();
    }
}

    

