package modul5;
import java.util.Scanner;

public class Pratikum5no5 {
    public static void main(String[] args) {
        String golongan;
        int masaKerja;
        Scanner input = new Scanner(System.in);
        System.out.println("|            |      MASA KERJA      |");
        System.out.println("| Golongan   | 0-10 | 11-20 | 21-30 |");
        System.out.println("| I          |  50% |   60% |   70% |");
        System.out.println("| II         |  60% |   70% |   80% |");
        System.out.println("| III        |  70% |   80% |   90% |");
        System.out.println("| IV         |  80% |   90% |   100%|");

        System.out.print("Masukan Golongan : ");
        golongan = input.nextLine().toUpperCase();
        System.out.print("Masukan Masa Kerja (Berapa Tahun) : ");
        masaKerja = input.nextInt();

        switch (golongan) {
            case "I":
            if (masaKerja <=10) {
                System.out.println("Mendapat Bonus : 50%");
            }else if (masaKerja <=20) {
                System.out.println("Mendapatkan Bonus : 60%");
            }else if (masaKerja <=30) {
                System.out.println("Mendapatkan Bonus : 70%");
            }else{
                System.out.println("pilihan anda tidak VAlid");
            }
            break;
            case "II":
            if (masaKerja <=10) {
                System.out.println("Mendapat Bonus : 60%");    
            }else if (masaKerja <=20) {
                System.out.println("Mendapatkan Bonus : 70%");
            }else if (masaKerja <=30) {
                System.out.println("Mendapatkan Bonus : 80%");
            }else{
                System.out.println("pilihan anda tidak VAlid");
            }
            break;
            case "III":
            if (masaKerja <=10) {
                System.out.println("Mendapat Bonus : 70%");    
            }else if (masaKerja <=20) {
                System.out.println("Mendapatkan Bonus : 80%");
            }else if (masaKerja <=30) {
                System.out.println("Mendapatkan Bonus : 90%");
            }else{
                System.out.println("pilihan anda tidak VAlid");
            }
            break;
            case "IV":
            if (masaKerja <=10) {
                System.out.println("Mendapat Bonus : 80%");    
            }else if (masaKerja <=20) {
                System.out.println("Mendapatkan Bonus : 90%");
            }else if (masaKerja <=30) {
                System.out.println("Mendapatkan Bonus : 100%");
            }else{
                System.out.println("pilihan anda tidak VAlid");
            }
            break;
        
            default:
                System.out.println("Golongan Tidak Tersedia");
            break;
        }
        input.close();

    }
}
