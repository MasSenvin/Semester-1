import java.util.Scanner;
public class Pratikum4no5 {
    public static void main(String[] args) {
        double uts1, uts2, uas, nilaiTotal;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai UTS 1 : ");
        uts1 = input.nextDouble();
        System.out.print("Masukan Nilai UTS 2 : ");
        uts2 = input.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextDouble();
        nilaiTotal = (0.3 * uts1)+(0.3 * uts2)+(0.4 * uas);

        if (nilaiTotal >= 80) {
            System.out.println("Nilai Final " + nilaiTotal + " A");

        } else if (65 <= nilaiTotal && nilaiTotal < 80) {
            System.out.println("Nilai Final " + nilaiTotal + " B");
            
        }else if (55 <= nilaiTotal && nilaiTotal < 65) {
            System.out.println("Nilai Final " + nilaiTotal + " C");
            
        }else if (50 <= nilaiTotal && nilaiTotal < 55) {
            System.out.println("Nilai Final " + nilaiTotal + " D");   
            
        }else if (nilaiTotal < 50){
            System.out.println("Nilai Final " + nilaiTotal + " E");
        } 
        input.close();
        }
            

    }

