import java.util.Scanner;

public class pratikum7no2 {
    public static void main(String[] args) {
            //deklarasi variabel
           double uts1, uts2, uas, nilaiTotal;
        
        //membuat objek scanner untuk input dari keyboard
        Scanner input = new Scanner(System.in);
        //melakukan perulangan dengan do while untuk memastikan nilai nilai tidak negatif dan tidak lebih dari 100
        do {
        System.out.println("Masukan Nilai tidak boleh negatif dan lebih dari 100");
        System.out.print("Masukan Nilai UTS 1 : ");
        uts1 = input.nextDouble();
        System.out.print("Masukan Nilai UTS 2 : ");
        uts2 = input.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextDouble(); 
    } while (uts1 <0 || uts1 >100 && uts2 <0 || uts2 >100 && uas<0 || uas >100);
        //menghitung nilai total dari nilai uts1, uts2, dan uas
        nilaiTotal = (0.3 * uts1)+(0.3 * uts2)+(0.4 * uas);
    
        //menentukan golongan A-E dengan menggunakan if
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
        //menutup class Scanner
        input.close();
        }
            

    }
    
