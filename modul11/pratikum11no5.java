package modul11;

import java.util.Arrays;

public class pratikum11no5 {
    public static void main(String[] args) {
        

        int[] usial = {18, 39, 45, 50, 65, 70, 90};
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};

        int[] gabungan = new int[usial.length + usia2.length];

        System.out.println("Isi Array Pertama: " + Arrays.toString(usial));
        System.out.println("Isi Array Kedua: " + Arrays.toString(usia2));

        for (int i = 0; i < gabungan.length; i++) {
            if (i < usial.length) {
                gabungan[i] = usial[i];
            } else {
                gabungan[i] = usia2[i - usial.length];
            }
        }

        System.out.println("Isi Array Gabungan:" + Arrays.toString(gabungan));

        Arrays.sort(gabungan);
        System.out.println("Isi Array Gabungan (Sorted): " + Arrays.toString(gabungan));
    }
}
    

