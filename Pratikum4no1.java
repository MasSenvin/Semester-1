import java.util.Scanner;
public class Pratikum4no1 {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Bilangan Bulat");
        bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan Bernilai Genap");
            
        } else {
            System.out.println("Bilangan Bernilai Ganjil");
        }
        input.close();

    }
}
