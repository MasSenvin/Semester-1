package modul5;
import java.util.Scanner;
public class Pratikum5no4 {
    public static void main(String[] args) {
        String ukuran;
        double hargatotal = 0;
        int jumlahKaos;


        Scanner input = new Scanner(System.in);
        System.out.println("|     UKURAN      |       HARGA PER BUAH      |");
        System.out.println("|       S         |         30.000            |");
        System.out.println("|       M         |         38.000            |");
        System.out.println("|       L         |         45.000            |");
        System.out.println("|       XL        |         50.000            |");
        System.out.println("|       XXL       |         60.000            |");
        System.out.println("_______________________________________________");


        System.out.print("Masukan Ukuran Baju  ");
        ukuran = input.nextLine().toUpperCase();
        System.out.print("Masukan Jumlah Kaos ");
        jumlahKaos = input.nextInt();

        switch (ukuran) {
            case "S" :
                hargatotal = 30_000*jumlahKaos;
                break;
            case "M" :
                hargatotal = 38_000*jumlahKaos;
                break;
            case "L":
                hargatotal = 45_000*jumlahKaos;
                break;
            case "XL":
                hargatotal = 50_000*jumlahKaos;
                break;
            case "XXL":
                hargatotal = 60_000*jumlahKaos;
                break;
            default:
                System.out.println("PILIHAN TIDAK TERSEDIA");
                break;

        }
        System.out.println("Harga Totalnya " + hargatotal);
        input.close();

    }
}
