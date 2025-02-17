package modul10;
import java.util.Scanner;
public class pratikum10no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasilFaktorial, n, r, combinasi, hasil2;
        System.out.println("masukan nilai n : ");
        n = input.nextInt();
        System.out.println("Masukan nilai r : ");
        r = input.nextInt();

        combinasi = combinasi(n, r);
        hasilFaktorial = faktorial(n);
        hasil2 = faktorial(r);


        System.out.println("Nilai dari "+n+ "! adalah " + hasilFaktorial);
        System.out.println("Nilai dari " +r+ "! adalah " +hasil2 );
        System.out.println("C(" + n + ", " + r + ") = " + combinasi);

        input.close();
      }
      static int faktorial(int n){
        int hasFak=1;
        if (n == 0) return 1;
        else for(int i = 1;i<=n;i++) hasFak = hasFak*i;
        return hasFak;
    }    
       static int combinasi(int n, int r){
        return 
        faktorial(n) / (faktorial(n-r)* faktorial(r));
       


        
      }
  }
    
 
 