import java.util.Scanner;
public class Pratikum4no4 {
    public static void main(String[] args) {
        double hargaPerbuah, jumlahBarang, hargaMinimal, hargaTotal, discount;
        Scanner input = new Scanner(System.in);
        System.out.println("jumlah Barang");
        jumlahBarang = input.nextDouble();
        hargaPerbuah = 100000;
        hargaMinimal = 1000000;
        hargaTotal = (jumlahBarang * hargaPerbuah);
        discount = 0; 
        if (hargaTotal >= hargaMinimal) {
            discount = (0.1 * hargaTotal) ;
        } else {
            discount = 0;
        }
        double hargaSetelahDiskon = (hargaTotal - discount);

        System.out.println("Total Harga Tanpa Diskon : " + hargaTotal);
        System.out.println("Discount : " + discount);
        System.out.println("Total Harga Sesudah Diskon : " + hargaSetelahDiskon);

        input.close();
    }
        

}
