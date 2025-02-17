import java.util.Scanner;
public class pratikum7no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//membuat objek scanner input ddari keyboard
        int banyakMangga, biasa= 0, bagus = 0, unggul= 0, i = 1;//mendeklarasikan variabel
        //Melakukan perulangan do-while untuk memastikan banyakMangga tidak kurang dari atau sama dengan 0
        do {
            System.out.print("Masukan Banyaknya Mangga : ");
            banyakMangga = input.nextInt();
        } while (banyakMangga<=0);
        
        //Melakukan perulangan while selama i kurang dari atau sama dengan banyakMangga
        while (i <= banyakMangga) {
            double berat;
            //Melakukan perulangan do-while untuk memasukkan berat setiap mangga
        do {
            System.out.print("Masukkan berat mangga ke-" + i + " (gram): ");
            berat = input.nextDouble();

        } while (berat <= 0);
        //untuk menentukan berat mangga yang pas dengan if 
        if (berat<500) {
            biasa++;
        }else if (berat<=750) {
            bagus++;
        }else{
            unggul++;
        }  
        //variabel i ditambah dengan 1
        i++;
       }
       //menampilkan jumlah mangga berdasarkan kualitas
        System.out.println("jumlah mangga berdasarkan kualitasnya : ");
        System.out.println("BIASA : " +biasa+ " Mangga" );
        System.out.println("BAGUS : " +bagus+ " Mangga" );
        System.out.println("UNGGUL : " + unggul + " Mangga");
        //menutup class Scanner
        input.close();
  
}
}