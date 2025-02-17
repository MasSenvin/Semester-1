package modul6;

import java.util.Scanner;

public class pratikum6no4 {
    public static void main(String[] args) {
    int putar = 1;//mendeklarasikan variabel yang bernama putar bertipe integer dan diberi nilai bil bulat 1
    double jumlah = 0;//mendeklarasikan variabel yang bernama jumlah bertipe double dan diberi nilai bil real 0
	double bilangan;//mendeklarasikan variabel yang bernama jumlah bertipe double
	Scanner tombol = new Scanner(System.in);//Membuat objek Scanner dengan nama input untuk mengambil input dari pengguna.
    // melakukan perulangan dengan menggunakan (while) untuk menghitung putar
	while ( putar <= 5 ) {
		System.out.print("Masukkan data ke "+putar+  ": ");
        bilangan = tombol.nextDouble();	
        jumlah = jumlah + bilangan;
		putar++;	
		}
	System.out.println("Jumlah 5 bilangan tersebut adalah " +  jumlah);
    tombol.close();
	}
	}

    

