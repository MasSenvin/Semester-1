package modul4b;
import java.util.Scanner;
public class Pratikum4bno4 {
    public static void main(String[] args) {
        int tanggal, bulan;
        String nama, alamat;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukin Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukin Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukin Tanggal Lahir : ");
        tanggal = input.nextInt();
        System.out.print("Masukin Bulan Lahir : ");
        bulan = input.nextInt();

        System.out.println("____________________________________________________________________________");
        System.out.println("Nama Anda       : " + nama);
        System.out.println("Alamat Anda     : "+alamat);
        System.out.println("Tanggal Lahir   : "+tanggal);
        System.out.println("Bulan           : " + bulan);


        if (bulan ==1 && tanggal >=20 && tanggal <=31 || bulan ==2 && tanggal >=1 && tanggal <=18) {
            System.out.println("Anda Berbintang : Aquarius");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==2 && tanggal >=19 && tanggal <=29 || bulan ==3 && tanggal >=1 && tanggal <=20) {
            System.out.println("Anda Berbintang : Pinces");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==3 && tanggal >=21 && tanggal <=31 || bulan ==4 && tanggal >=1 && tanggal <=19) {
            System.out.println("Anda Berbintang : Aries");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==4 && tanggal >=20 && tanggal <=31 || bulan ==5 && tanggal >=1 && tanggal <=20) {
            System.out.println("Anda Berbintang : Taurus");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==5 && tanggal >=21 && tanggal <=31 || bulan ==6 && tanggal >=1 && tanggal <=20) {
            System.out.println("Anda Berbintang : Gemini");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==6 && tanggal >=21 && tanggal <=31 || bulan ==7 && tanggal >=1 && tanggal <=22) {
            System.out.println("Anda Berbintang : Cancer");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==7 && tanggal >=23 && tanggal <=31 || bulan ==8 && tanggal >=1 && tanggal <=22) {
            System.out.println("Anda Berbintang : Leo");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==8 && tanggal >=23 && tanggal <=31 || bulan ==9 && tanggal >=1 && tanggal <=22) {
            System.out.println("Anda Berbintang : Virgo");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==9 && tanggal >=23 && tanggal <=31 || bulan ==10 && tanggal >=1 && tanggal <=22) {
            System.out.println("Anda Berbintang : Libra");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==10 && tanggal >=23 && tanggal <=31 || bulan ==11 && tanggal >=1 && tanggal <=21) {
            System.out.println("Anda Berbintang : Scorpio");
            System.out.println("Sifat Anda      : ");
        }else if (bulan ==11 && tanggal >=22 && tanggal <=31 || bulan ==12 && tanggal >=1 && tanggal <=21) {
            System.out.println("Anda Berbintang : Sagitarius");
            System.out.println("Sifat Anda      : ");
        }
        input.close();
    }
}
