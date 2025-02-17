import java.util.Scanner;
public class pratikum7for_no1 {
    public static void main(String[] args) {
        //mendeklarasikan variabel
        int n;
        double tahanan = 0, total= 0;
        String susunan;
        
        Scanner input = new Scanner(System.in);// menginputt class scannner melalui keyboard
        System.out.print("Masukan Jumlah Tahanan ( N ) : ");
        n = input.nextInt();
        //melakukan perulangan menggunakan for untuk memasukan nilai tahanan dari jumlah yag diinput
        for(int i = 1; i<=n; i++){
            System.out.print("Masukan nilai tahanan " + i + " : ");
            tahanan = input.nextDouble();
            tahanan = total + tahanan;
        }
            //memilih susunan paralel atau seri
             System.out.print("Pilih susunan Paralel atau Seri : ");
        susunan = input.next();
       
        //mengecet pilihan dengan if untuk menjalankan perintah selanjutnya
        if (susunan.equalsIgnoreCase("Seri")) {
            total = tahanan + 0;
                
        }else if (susunan.equalsIgnoreCase("Paralel")) {
            total = 1 / ((1 / total)+ (1 / tahanan));

                
            
        }else{
            System.out.println("Jenis susunan tahanan tidak Valid");
        }
    
        System.out.println("Tahanan Total " + total + "ohm");
        //menutup class Scanner
        input.close();
}
        
    }
