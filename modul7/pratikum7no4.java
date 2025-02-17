import java.util.Scanner;

public class pratikum7no4 {
    public static void main(String[] args) {
        int jumlahData, perbandingan = 1;
        double rataRata, total= 0, data=0;
        double max=0, min=0, rentanData, variansi, deviasi, xn2=0;     Scanner input = new Scanner (System.in);
        System.out.print("Masukan banyak data yang akan diproses : ");
              jumlahData = input.nextInt();
 
         
        while (jumlahData >=perbandingan) {
            System.out.print("Data Ke : "+ perbandingan+ ": ");
            data = input.nextDouble();
            
            total=total+data;
            xn2 = xn2 + Math.pow(data, 2);

            perbandingan++;

       if (data == 1) {
            max = data;
        }else if (data>max) {
            max = data;
        }if (data == 1) {
            min = data;
        }else if (data<min) {
            min = data;
            
        }
         
         }  

         
                   
        rataRata = total / jumlahData;
        rentanData  = max - min;
        variansi = (total)-jumlahData * Math.pow(rataRata, 2)/jumlahData;
        deviasi = Math.sqrt(variansi);



        System.out.println("Rata-ratanyanya adalah :"+ rataRata);
        System.out.println("Data Terbesar :"+max);
        System.out.println("Data Terkecil :"+min);
        System.out.println("Data Rentan Data : "+ rentanData);
        System.out.println("Data Variansinya : "+variansi);
        System.out.println("Data deviansi : "+ deviasi);
        input.close();
    }
}
