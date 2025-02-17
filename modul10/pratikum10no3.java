package modul10;

import java.util.Scanner;

public class pratikum10no3 {
    public static void main(String[] args) {

        // Baca koordinat tiga titik sudut
        System.out.println("Masukkan koordinat titik A:");
        double xA = bacaKoordinat("absis");
        double yA = bacaKoordinat("ordinat");

        System.out.println("Masukkan koordinat titik B:");
        double xB = bacaKoordinat("absis");
        double yB = bacaKoordinat("ordinat");

        System.out.println("Masukkan koordinat titik C:");
        double xC = bacaKoordinat("absis");
        double yC = bacaKoordinat("ordinat");

        // Hitung panjang sisi segitiga
        double sisiA = hitungJarak(xA, yA, xB, yB);
        double sisiB = hitungJarak(xB, yB, xC, yC);
        double sisiC = hitungJarak(xC, yC, xA, yA);

        // Hitung keliling segitiga
        double keliling = hitungKeliling(sisiA, sisiB, sisiC);
        System.out.println("Keliling segitiga: " + keliling);

        // Hitung dan tampilkan luas segitiga
        double luas = hitungLuas(sisiA, sisiB, sisiC);
        System.out.println("Luas segitiga: " + luas);

    
    }
    //sub program untuk baca koordinat
    static double bacaKoordinat(String jenis) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan " + jenis + ": ");
        return input.nextDouble();
    
    }

    //sub program untuk hitungjaral
    static double hitungJarak(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    //su program untuk hitung keliling
    static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }
    //sub program untuk hitung luas
    static double hitungLuas(double sisiA, double sisiB, double sisiC) {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
    
}
    

