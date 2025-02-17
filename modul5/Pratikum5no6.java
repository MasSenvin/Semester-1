package modul5;
import java.util.Scanner;
public class Pratikum5no6 {

    public static void main(String[] args) {
       // enum Agama {
          //  HINDU,
            //BUDHA,
           // YAHUDI,
           // KATOLIK,
           // KRISTEN,
            //ISLAM;
        // }

         String inputAgama;
         Scanner input = new Scanner(System.in);
         System.out.println("Masukan Agama (HINDU, BUDHA, YAHUDI, KATOLIK, KRISTEN, ISLAM)");
         inputAgama = input.nextLine().toUpperCase();
         //inputAgama = input.nextLine().toUpperCase();
         //Agama agama = Agama.valueOf(inputAgama);

         switch (inputAgama) {
            case "HINDU":
                System.out.println("Agama : Hindu");
                System.out.println("KITAB SUCINYA ADALAH : VEDA "+"NABINYA ADALAH : -");
                break;
            case "BUDHA":
                System.out.println("Agama : Budha");
                System.out.println("KITAB SUCINYA ADALAH : TRIPITAKA "+"NABINYA ADALAH : SIDARTA GAUTAMA");
                break;
            case "YAHUDI":
                System.out.println("Agama : Yahudi");
                System.out.println("KITAB SUCINYA ADALAH : TAURAT "+"NABINYA ADALAH : MUSA");
                break;
            case "KATOLIK":
                System.out.println("Agama : Katolik");
                System.out.println("KITAB SUCINYA ADALAH : INJIL "+"NABINYA ADALAH : YESUS");
                break;
            case "KRISTEN":
                System.out.println("Agama : Kristen");
                System.out.println("KITAB SUCINYA ADALAH : INJIL "+"NABINYA ADALAH : YESUS");
                break;
            case "ISLAM":
                System.out.println("Agama : Islam");
                System.out.println("KITAB SUCINYA ADALAH : ALQURAN "+"MUHAMAD");
                break;
            default:
                System.out.println("Data Tidak Valid");
                break;
         }
         input.close();
         



}
}
