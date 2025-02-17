import java.util.Scanner;
public class Pratikum4no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bilangan1, bilangan2, bilangan3;

        System.out.print("Masukan Bilangan Pertama ");
        bilangan1 = input.nextInt();
        System.out.print("Masukan Bilangan Kedua ");
        bilangan2 = input.nextInt();
        System.out.print("Masukan Bilangan Ketiga ");
        bilangan3 = input.nextInt();

        if (bilangan1 <= bilangan2 && bilangan2 <= bilangan3) {
            System.out.println("Urutannya adalah " + bilangan1 + ", " + bilangan2 +", dan " + bilangan3); 
        }else if (bilangan1 <= bilangan3 && bilangan1 <= bilangan2) {
            System.out.println("Urutannya adalah " + bilangan1 + ", " + bilangan3 +", dan " + bilangan2); 
        }else if (bilangan2 <= bilangan3 && bilangan3 <= bilangan1) {
            System.out.println("Urutannya adalah " + bilangan2 + ", " + bilangan3 +", dan " + bilangan1); 
        }else if (bilangan2 <= bilangan1 && bilangan1 <= bilangan3) {
            System.out.println("Urutannya adalah " + bilangan2 + ", " + bilangan1 +", dan " + bilangan3); 
        }else if (bilangan3 <= bilangan1 && bilangan1 <= bilangan2) {
            System.out.println("Urutannya adalah " + bilangan3 + ", " + bilangan1 +", dan " + bilangan2); 
        }else{
            System.out.println("Urutannya adalah " + bilangan3 + ", " + bilangan2 +", dan " + bilangan1); 
        }
        input.close();
    }
}
