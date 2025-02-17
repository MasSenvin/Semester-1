package modul6;
import java.util.Scanner;
public class pratikum6no6 {
    public static void main(String[] args) {
        int jumlahData, perbandingan = 1; //mendeklarasikan variabel yang bernama jumlahData, perbandingan dengan tipe integer
        double rataRata, total= 0, data; //mendeklarasikan variabel yang bernama rataRata, total, data dengan tipe double dan variabel total diberi bil real 0
        Scanner input = new Scanner (System.in);//Membuat objek input dari kelas scanner untuk menerima input dari keyboard
        System.out.print("Masukan banyak data yang akan diproses : ");//Mencetak ke layar
        jumlahData = input.nextInt();//membaca input nilai jumlahData yang dimasukan oleh user dan disimpan ke jumlahData

        // Kode tersebut merupakan loop while dalam Java yang membaca sejumlah data numerik dari pengguna menggunakan Scanner, menghitung totalnya, dan terus berlanjut hingga jumlah data mencapai batas yang ditentukan.
        while (jumlahData >=perbandingan) {
            System.out.print("Data Ke : "+ perbandingan+ ": ");
            data = input.nextDouble();
            
            total=total+data;

            perbandingan++;
        }
        //mengihitung rata-ratanya
        rataRata = total / jumlahData;

        System.out.println("Rata-ratanyanya adalah :"+ rataRata);//mencetak ke layar
        input.close(); //menutup class Scanner



    }
}
