import java.util.Scanner;
public class pratikum7for_no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendeklarasikan variabel 
        double a, b, c, deskrim, x1, x2;
         // Input nilai koefisien a, b, dan c
        System.out.print("Masukan Nilai a : ");
        a = input.nextDouble();
        System.out.print("Masukan Nilai b : ");
        b = input.nextDouble();
        System.out.print("Masukan Nilai c : ");
        c = input.nextDouble();
        
        // Hitung diskriminan (D)
        deskrim = b * b - 4 * a * c;
        // mengecek dengan if
        if (deskrim >= 0) {
            // Hitung akar persamaan kuadrat
            x1 = -b + Math.sqrt(deskrim)/ (2 * a);
            x2 = -b - Math.sqrt(deskrim)/ (2 * a);
             // Menampilkan persamaan kuadrat dan akar-akarnya
            System.out.println("Dari persamaan y = " + a + "x^2 + "+ b + " x = " + c);
            System.out.println("Akar akarnya adalah " + x1 + " dan " + x2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah:");
             // Menampilkan tabel nilai y untuk beberapa x
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("%-10s%-25s\n", "x", "y = " + a + "x^2 + " + b + "x + " + c);
            System.out.println("--------------------------------------------------------------------------");
            // melakukan perulangan dengan for
            for (double x = x1; x <= x2; x += 0.25) {
                double y = a * x * x + b * x + c;
                System.out.printf("%-10.2f%-25.2f\n", x, y);
            }

            System.out.println("--------------------------------------------------------------------------");
        } else {
            System.out.println("Persamaan tidak memiliki akar real.");
        }

      input.close();

            
        }
    }

