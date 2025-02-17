package modul6;

public class pratikum6no5 {
    public static void main(String[] args) {
        //mendeklarasikan variabel yang bernama hargaPerLiter, jumlahLiter, hargaTotal 
        //dan diberi nilai bilangan bulat pada variabel hargaPerLiter, dan jumlahLiter
        int hargaPerLiter = 6500, jumlahLiter = 1, hargaTotal;
        //menampilkan teks di layar 
        System.out.println( "|  Jumlah Liter    |       Harga(Rp)       |");
        System.out.println("=============================================");
        // melakukan perulangan dengan while(ketika) untuk menghitung dan menampilkan jumlah liter dan harga 
        while (jumlahLiter <=20) {
            hargaTotal = jumlahLiter*hargaPerLiter;
            System.out.println("|        "+jumlahLiter + "          |"       + hargaTotal);
            jumlahLiter++;
            
        }


    }
}
