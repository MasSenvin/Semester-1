import java.util.Scanner;

public class UAS_235314029 {
    
    private static final String HIJAU = "Hijau";
    private static final String ORANYE = "Oranye";
    private static final String MERAH = "Merah";

    public static String tentukanKategori(int jumlahPasien) {
        if (jumlahPasien <= 10) {
            return HIJAU;
        } else if (jumlahPasien <= 50) {
            return ORANYE;
        } else {
            return MERAH;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int daerah;
        do {
            System.out.println("Masukkan Banyak Daerah (minimal 1): ");
            daerah = input.nextInt();
        } while (daerah < 1);

        int[] jmlPasienDaerah = new int[daerah];

        System.out.println("Masukkan Jumlah Pasien per daerah:");
        for (int n = 0; n < daerah; n++) {
            System.out.print("Jumlah Pasien Daerah " + (n + 1) + ": ");
            jmlPasienDaerah[n] = input.nextInt();
        }

        System.out.println("Daerah\tJml Pasien\tKategori");
        System.out.println("=============================");
        for (int i = 0; i < jmlPasienDaerah.length; i++) {
            String kategori = tentukanKategori(jmlPasienDaerah[i]);
            System.out.println((i + 1) + "\t" + jmlPasienDaerah[i] + "\t\t" + kategori);
        }
        System.out.println("=============================");

        int total = 0;
        int maxPasien = Integer.MIN_VALUE;
        int minPasien = Integer.MAX_VALUE;

        for (int jmlPasien : jmlPasienDaerah) {
            total += jmlPasien;
            if (jmlPasien > maxPasien) {
                maxPasien = jmlPasien;
            }
            if (jmlPasien < minPasien) {
                minPasien = jmlPasien;
            }
        }

        double rataRata = (double) total / jmlPasienDaerah.length;

        System.out.println("Jumlah total pasien\t\t= " + total);
        System.out.println("Rata-rata jumlah pasien\t= " + String.format("%.2f", rataRata));
        System.out.println("Jumlah pasien terbanyak\t= " + maxPasien);
        System.out.println("Jumlah pasien paling sedikit\t= " + minPasien);

        int hijau = 0, oranye = 0, merah = 0;
        for (int jmlPasien : jmlPasienDaerah) {
            String kategori = tentukanKategori(jmlPasien);
            switch (kategori) {
                case "Hijau":
                    hijau++;
                    break;
                case "Oranye":
                    oranye++;
                    break;
                case "Merah":
                    merah++;
                    break;
            }
        }

        System.out.println("Jumlah daerah zona hijau\t= " + hijau);
        System.out.println("Jumlah daerah zona oranye\t= " + oranye);
        System.out.println("Jumlah daerah zona merah\t= " + merah);
    }
}