package modul10;

public class pratikum10no4 {
    public static void main(String[] args) {
        int n = 5;
        for(double z =-4;z<=4;z=z+0.1){
        int jumlahBintang = normal(n, z);
        bintang(jumlahBintang);
        }
    }
    static int normal (int n, double z){
        double pi = Math.PI;
        double pembagi = Math.sqrt(2*pi);
        double eksponen = -0.5 * Math.pow(z, 2);
        double f = (1 / pembagi) * Math.exp(eksponen);
        return (int) Math.round(n*f);
    }
    static void bintang(int m){
        for(int i = 1;i<=m; i++) System.out.print("*");
        System.out.println();
    }
}
