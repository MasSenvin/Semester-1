package modul11;

import java.util.Scanner;

public class pratikum11no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] skor, cadangan;
        skor = new int[5];
        cadangan = new int[5];

        System.out.println("Masukan 5 data bulat");

        for(int i = 0;i <=4;i++){
            System.out.print("Data ke " + (i+1) + " : ");
            skor[i]= input.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            cadangan[i] = skor[i];
        }
        System.out.println("Isi array skor:");
        for (int i = 0; i <= 4; i++)
            System.out.println("Data ke " + (i + 1) + " adalah " + skor[i]);

        // Menampilkan isi array cadangan
        System.out.println("Isi array cadangan:");
        for (int i = 0; i <= 4; i++)
            System.out.println("Data ke " + (i + 1) + " adalah " + cadangan[i]);
input.close();  
    } 
   

    
    }



    

