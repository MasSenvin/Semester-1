package modul10;
import java.util.Scanner;
public class pratikum10no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("Masukan nilai n : ");
        n = input.nextInt();
        if (n>=0) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                     System.out.print(" ");// Spasi untuk penataan rapi
                }
    
                for (int j = 0; j <= i; j++) {
                    System.out.print( combinasi(i, j)+ " ");
                }
    
                System.out.println();
            }
        }else{

        }
        input.close();

    }
     static int combinasi (int n, int r){
        return faktorial(n)/ (faktorial(n - r) * faktorial(r));
    }
     static int faktorial(int j){
        int hasFak=1;
        if (j == 0) return 1;
        else for(int i = 1;i<=j;i++) hasFak = hasFak*i;
        return hasFak;
        } 
    }

