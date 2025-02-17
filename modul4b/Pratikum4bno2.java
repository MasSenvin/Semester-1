    package modul4b;
    import java.util.Scanner;
    public class Pratikum4bno2 {

        
        public static void main(String[] args) {
        String ukuran;
        double hargatotal;
        int jumlahKaos;
        
        Scanner input = new Scanner(System.in);
        System.out.println("|     UKURAN      |       HARGA PER BUAH      |");
        System.out.println("|       S         |         30.000            |");
        System.out.println("|       M         |         38.000            |");
        System.out.println("|       L         |         45.000            |");
        System.out.println("|       XL        |         50.000            |");
        System.out.println("|       XXL       |         60.000            |");
        System.out.println("_______________________________________________");

        System.out.print("Masukan Ukuran Baju ");
        ukuran = input.nextLine();
        System.out.print("Masukan Jumlah Kaos yang dibeli ");
        jumlahKaos = input.nextInt();

        if (ukuran.equalsIgnoreCase("S")) {
            hargatotal = 30_000*jumlahKaos;
            System.out.println("Harga Totalnya : " + hargatotal);
        } else if (ukuran.equalsIgnoreCase("M")) {
            hargatotal = 38_000*jumlahKaos;
            System.out.println("Harga Totalnya : " + hargatotal);

        }else if (ukuran.equalsIgnoreCase("L")) {
            hargatotal = 45_000*jumlahKaos;
            System.out.println("Harga Totalnya : "+ hargatotal);
            
        }else if (ukuran.equalsIgnoreCase("XL")) {
            hargatotal = 50_000*jumlahKaos;
            System.out.println("Harga Totalnya : "+ hargatotal);
            
        }else if (ukuran.equalsIgnoreCase("XXL")) {
            hargatotal = 60_000*jumlahKaos;
            System.out.println("Harga Totalnya : "+ hargatotal);
        }else{
            System.out.println("PILIHAN TIDAK TERSEDIA");
        }
        input.close();
    } 
        
    }

        
