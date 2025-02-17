import java.util.Scanner;
public class Pratikum4no2 {
    public static void main(String[] args) {
        int bil1, bil2;
        Scanner input = new Scanner(System.in);
        System.out.println("bilangan 1");
        bil1 = input.nextInt();
        System.out.println("Bilangan 2");
        bil2 = input.nextInt();

        if (bil1 > bil2) {
            System.out.println("Bilangan " + bil1 + " lebih besar dari bilangan " + bil2);
            
        } else if (bil1 == bil2) {
            System.out.println("Bilangan " + bil1 + " Sama dengan bilangan " + bil2);

            
        } else {
            System.out.println("bilangan " + bil2 + " lebih besar dari bilangan " +bil1);
        }  
        input.close();          
        

    }
}
