import java.util.Scanner;
public class pratikum7no1 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;//dekralasi Variabel
        Scanner input = new Scanner(System.in);
        //Melakukan perulangan do-while untuk memastikan nilai a tidak sama dengan 0
        do {
            System.out.print("Masukan nilai a : ");
            a = input.nextDouble();
        } while (a==1);
        //memasukan nilai a dan b 
        System.out.print("Masukan nilai b : ");
        b = input.nextDouble();
        System.out.print("Masukan nilai c : ");
        c = input.nextDouble();
        //menghitung deltanya dari persamaan kuadrat
        delta = b * b - 4 * a * c;
        //melakukan pengecekan dengan if untuk menentukan persamaan kuadarat
        if (delta >0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta))/ (2 * a);
            System.out.println("Akar-akar persamaan kuadrat" + x1 + " dan " + x2);    
        } else if (delta == 0 ) {
            x1 = -b / (2 * a);
            System.out.println("Akar sama persamaan kuadrat : " + x1);

        }else{
            System.out.println("Persamaan ini tidak memiliki akar real");
        }

        //menutup kelas Scanner
        input.close();

        
    }
}
