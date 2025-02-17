package modul5;
import java.util.Scanner;
public class Pratikum5no3 {
    public static void main(String[] args) {
        int jumlahHari = 0, bulan;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bulan (1-12) ");
        bulan = input.nextInt();

        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                jumlahHari = 31;
                break;
            case 4: case 6: case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                jumlahHari = 28;
            default:
                System.out.println("Data tidak Valid masehhh");
                break;
        }
        System.out.println(" dalam bulan (1-12) " + bulan + " Maka jumlah harinya " + jumlahHari);
        input.close();
    }
}
