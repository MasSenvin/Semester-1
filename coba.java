import java.util.Scanner;

class Pembeli {
    private String nama;

    public Pembeli(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Penjual {
    private String nama;

    public Penjual(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Kurir {
    private String nama;

    public Kurir(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Resi {
    private Pembeli pembeli;
    private Penjual penjual;
    private Kurir kurir;

    public Resi(Pembeli pembeli, Penjual penjual, Kurir kurir) {
        this.pembeli = pembeli;
        this.penjual = penjual;
        this.kurir = kurir;
    }

    public void tampilkanResi() {
        System.out.println("Resi Pembelian:");
        System.out.println("Pembeli: " + pembeli.getNama());
        System.out.println("Penjual: " + penjual.getNama());
        System.out.println("Kurir: " + kurir.getNama());
        System.out.println("Terima kasih telah berbelanja!");
    }
}
public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();
        Pembeli pembeli = new Pembeli(namaPembeli);

        System.out.print("Masukkan nama penjual: ");
        String namaPenjual = scanner.nextLine();
        Penjual penjual = new Penjual(namaPenjual);

        System.out.print("Masukkan nama kurir: ");
        String namaKurir = scanner.nextLine();
        Kurir kurir = new Kurir(namaKurir);

        Resi resi = new Resi(pembeli, penjual, kurir);

        System.out.println("Resi berhasil dibuat!");
        resi.tampilkanResi();
    }
}