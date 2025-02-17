import java.util.Scanner;
public class Pratikum4no3 {
    public static void main(String[] args) {
        double tinggiBdn, beratBdn, pengurangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Tinggi Badan (cm) : ");
        tinggiBdn = input.nextDouble();
        System.out.println("Masukan Berat Badan (kg) : ");
        beratBdn = input.nextDouble();

        pengurangan = (tinggiBdn - beratBdn);
        
        if (pengurangan >=90 && pengurangan <= 110 ) {
            System.out.println("Maka berat badan anda ideal");

        } else if (pengurangan < 90 ) {
            System.out.println("maka berat badan anda terlalu gemuk");
            
        } else if (pengurangan > 110) {
            System.out.println("Maka berat badan anda terlalu kurus");
        }else{
            System.out.println("Masukin yang bener");
            
        }
        input.close();
    }
}
