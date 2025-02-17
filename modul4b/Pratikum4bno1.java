package modul4b;
import java.util.Scanner;
public class Pratikum4bno1 {
    public static void main(String[] args) {
        double a, b, c, x, x1, x2, simpanan ;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai A : ");
        a = input.nextDouble();
        System.out.print("Masukan Nilai B : ");
        b = input.nextDouble();
        System.out.print("Masukan Nilai c : ");
        c = input.nextDouble();

        simpanan = (b*b) - (4 * a * c);

        if (simpanan > 0) {
            x1 = (-b + Math.sqrt(simpanan))/(2 * a);
            x2 = (-b - Math.sqrt(simpanan))/(2 * a);
            System.out.println("X1 : " + x1);
            System.out.println("X2 : " + x2);
      
        }else if (simpanan == 0) {
            x = (-b + Math.sqrt(simpanan))/(2 * a);
            System.out.println("X : " + x);

        }else{
            System.out.println("Jawaban Terlaluuuuu");
        }
        
        input.close();

    }
}
