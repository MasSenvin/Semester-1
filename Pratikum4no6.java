import java.util.Scanner;
public class Pratikum4no6 {
    public static void main(String[] args) {
    double sisi1, sisi2, sisi3, sisiPanjang, sisiTengah, sisiPendek;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Sisi Pertama ");
    sisi1= input.nextDouble();
    System.out.print("Masukan Sisi Kedua ");
    sisi2 = input.nextDouble();
    System.out.print("Masukan Sisi Ketiga ");
    sisi3 = input.nextDouble();

    sisiPanjang = Math.max(sisi1, Math.max(sisi2, sisi3));
    sisiPendek = 0.0;
    sisiTengah = 0.0;


    if (sisiPanjang == sisi1) {
        sisiTengah = Math.max(sisi2, sisi3);
        sisiPendek = Math.min(sisi2, sisi3);
    }else if (sisiPanjang == sisi2) {
        sisiTengah = Math.max(sisi1, sisi3);
        sisiPendek = Math.min(sisi1, sisi3);
    }else if (sisiPanjang == sisi3){
        sisiTengah = Math.max(sisi1, sisi2);
        sisiPendek = Math.min(sisi1, sisi2);
    }else {
        System.out.println("Masukin Angka Yang Valid");
    }
    //dengan pytagoras
    boolean sikusiku = Math.pow(sisiPanjang, 2) == Math.pow(sisiTengah, 2) + Math.pow(sisiPendek, 2);

    if (sikusiku) {
        System.out.println("Merupakan Segitiga Siku-Siku");
    }else{
        System.out.println("Bukan Segitiga Siku-Siku");
    }
    input.close();
     
    }
   
}
