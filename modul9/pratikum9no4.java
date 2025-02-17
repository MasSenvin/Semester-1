package modul9;
import java.util.Scanner;
public class pratikum9no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia, totalUsia=0;
        int pilihan;
        int data= 0;
        do {
            System.out.println("Menu");
            System.out.print("1. Memasukan data usia : ");

            System.out.print("2. Rata-rata : ");
            System.out.print("3. Deviasi standar : ");
            System.out.print("4. Diagram batang : ");
            System.out.println("5. Keluar : ");
            System.out.println("Masukan Pilihan anda (1-5); ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Usia : ");
                    usia = input.nextInt();
                    totalUsia = totalUsia + usia;
                     break;
                case 2:
                    if (data >0) {
                        double rataRata = totalUsia / data;
                        System.out.println(" rata Ratanya : "+rataRata);
                        
                    }else{
                        System.out.println(" data tidak ada ");
                    }
                    break;
                case 3 :
                    if (data > 1) {
                        double rataRata= 0;
                        double diviasi =  Math.pow(totalUsia, 2) - (2 * totalUsia * rataRata) + (data * Math.pow(rataRata, 2 ));
                        System.out.println(" Deviasi Standar : " + diviasi);
                    }else{
                        System.out.println("Belum ada data usia yang ditampilkan");
                    }
                    break;
                case 4 :
                    if (data > 0 ) {
                        for(int i = 0; i < 5 ; i++){
                            int bawah = i * 20;
                            int atas = (i + 1) * 20;
                            if (totalUsia >= bawah && totalUsia <= atas) {
                                System.out.print("*");
                                
                            }
                            System.out.println("");
                        }
                        
                    }else{
                        System.out.println(" Belum ada data usia yang ditampilkan ");
                    }
                    break;
                case 5 :
                    System.out.println(" selamat anda keluar ");
                    break;
                default:
                    System.out.println(" data tidak valid");
                    break;
            }
               

        } while (pilihan != 5);
        input.close();
        
    }
}
