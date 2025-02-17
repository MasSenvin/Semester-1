    import java.util.Scanner;
    public class pratikum7for_no2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n;
            double kuadratData=0, akarData=0, tidakSama=0, data=0;

            System.out.print("Masukan jumlah Data : ");
            n = input.nextInt();
            
            for(int i = 1 ; i<=n ; i++){
                System.out.print("Masukan data "+ i +" : ");
                data= input.nextDouble();
            }
            kuadratData = kuadratData + Math.pow(data, 2);
            akarData = akarData + Math.sqrt(data);
            
            if (data != 0) {
                    tidakSama = tidakSama + 1 /data;
                
            }
            
            System.out.println("Jumlah Kuadrat data yakni : "+ kuadratData);
            System.out.println("Jumlah Akar data yakni : " + akarData);
            System.out.println("Jumlah 1/data untuk data yang tidak sama dengan nol yakni : " + tidakSama);
            input.close();

        }
    }
