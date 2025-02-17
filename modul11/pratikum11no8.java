package modul11;

import java.util.Scanner;

public class pratikum11no8 {
    public static void main(String[] args) {
        
        int[] NIM = new int[10];
        String[] Final = new String[10];
        String[] Nama = new String[10];
        double[] us1 = new double[10];
        double[] us2 = new double[10];
        double[] uas = new double[10];
        double[] totalNil = new double[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jml = sc.nextInt();

        for (int i = 0; i < jml; i++) {
            System.out.println((i + 1) + ". ");
            System.out.print("Nama: ");
            Nama[i] = sc.next();
            System.out.print("NIM: ");
            NIM[i] = sc.nextInt();
            System.out.print("us1 : ");
            us1[i] = sc.nextDouble();
            System.out.print("us2: ");
            us2[i] = sc.nextDouble();
            System.out.print("uas: ");
            uas[i] = sc.nextDouble();

            totalNil[i] = (us1[i] * 0.3) + (us2[i] * 0.3) + (uas[i] * 0.4);
            System.out.println("Total: " + totalNil[i]);

            if (totalNil[i] >= 80 && totalNil[i] <= 100) {
                Final[i] = "A";
            } else if (totalNil[i] >= 65 && totalNil[i] < 80) {
                Final[i] = "B";
            } else if (totalNil[i] >= 55 && totalNil[i] < 65) {
                Final[i] = "C";
            } else if (totalNil[i] >= 45 && totalNil[i] < 55) {
                Final[i] = "D";
            } else if (totalNil[i] < 45) {
                Final[i] = "E";
            }

            System.out.println("Final: " + Final[i]);
            System.out.println("\n");

            System.out.println("Daftar Nilai Mahasiswa TI USD");
            System.out.println("==========================================");
            System.out.println("No. \t Nama \t NIM \t US1 \t US2 \t UAS \t Total \t Final");
            System.out.println();

            for (int a = 0; a < jml; a++) {
                System.out.println((a + 1) + "\t" + Nama[a] + "\t" + NIM[a] + "\t \t" + us1[a] + "\t" + us2[a] + "\t" + uas[a] + "\t" + totalNil[a] + "\t" + Final[a]);
            }

            for (int k = 0; k < jml - 1; k++) {
                for (int j = 0; j < jml - 1; j++) {
                    if (totalNil[j] < totalNil[j + 1]) {
                        // swap
                        double tempNilai = totalNil[j];
                        totalNil[j] = totalNil[j + 1];
                        totalNil[j + 1] = tempNilai;

                        double tempUs1 = us1[j];
                        us1[j] = us1[j + 1];
                        us1[j + 1] = tempUs1;

                        double tempUs2 = us2[j];
                        us2[j] = us2[j + 1];
                        us2[j + 1] = tempUs2;

                        double tempUas = uas[j];
                        uas[j] = uas[j + 1];
                        uas[j + 1] = tempUas;

                        String tempNama = Nama[j];
                        Nama[j] = Nama[j + 1];
                        Nama[j + 1] = tempNama;

                        int tempNIM = NIM[j];
                        NIM[j] = NIM[j + 1];
                        NIM[j + 1] = tempNIM;

                        String tempFinal = Final[j];
                        Final[j] = Final[j + 1];
                        Final[j + 1] = tempFinal;
                    }
                }
            }

            System.out.println("\n");
            System.out.println("Daftar Nilai Mahasiswa TI USD Urut Terbaik");
            System.out.println("No. \t Nama \t NIM \t US1 \t US2 \t UAS \t Total \t Final");
            System.out.println("==========================================");

            for (int j = 0; j < jml; j++) {
                System.out.println((j + 1) + "\t" + Nama[j] + "\t" + NIM[j] + "\t" + us1[j] + "\t" + us2[j] + "\t" + uas[j] + "\t" + totalNil[j] + "\t" + Final[j]);
            }

            sc.close();
        }
    }
}

    
