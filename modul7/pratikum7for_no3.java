import java.util.Scanner;
public class pratikum7for_no3 {
    public static void main(String[] args) {
        // menginput clas scanner untuk diisi melalui keyboard
        Scanner input = new Scanner(System.in);
        //mendeklarasikan Variabel
        int n=0, angka1 = 1, angka2 = 1, angka3;

      
            System.out.print("Masukan Jumlah Nilai : ");
            n= input.nextInt();

        System.out.print(angka1+", "+angka2);
        // melakukan perulangan melalui for
        for(int i = 3; i<=n;i++){
           angka3= angka1 + angka2;
           System.out.print(", " + angka3);
           angka1 = angka2;
           angka2 = angka3;

        }
        // menutup class Scanner
        input.close();
    }
}
