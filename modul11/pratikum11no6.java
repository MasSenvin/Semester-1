
package modul11;
import java.util.Arrays;
public class pratikum11no6 {
    public static void main(String[] args) {
         int[] Bilangan = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};

        int[] gen = new int[6];
        int[] gan = new int[7];

        int genap = 0, ganjil = 0;

        for (int i = 0; i < Bilangan.length; i++) {
            if (Bilangan[i] % 2 == 0) {
                gen[genap] = Bilangan[i];
                genap++;
            } else {
                gan[ganjil] = Bilangan[i];
                ganjil++;
            }
        }

        System.out.println("Isi Array Bilangan:" + Arrays.toString(Bilangan));
        System.out.println("Isi Array Bil. Genap: " + Arrays.toString(gen));
        System.out.println("Isi Array Bil. Ganjil :" + Arrays.toString(gan));    
    }
}