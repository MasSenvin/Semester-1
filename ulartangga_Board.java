import java.util.Random;
import java.util.Scanner;

public class ulartangga_Board {
    
    public static void main(String[] args) {
      
            
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] snakes = {6, 12, 20, 27, 63, 71, 55, 99};
        int[] ladders = {3, 9, 10, 15 , 24, 37, 51, 80, 96, };

        int playerPosisi = 1;
        int posisifinal = 100;
        

        initializeGame(snakes, ladders, random);

        System.out.println(" ! SELAMAT DATANG DI PERMAINAN ULAR TANGGA !");
        System.out.println("==============================================");

        while (playerPosisi < posisifinal) {
            printBoard(playerPosisi, snakes, ladders);

            System.out.print("Klik Tombol ENTER Untuk Melempar Dadu : ");
            scanner.nextLine();

            int diceRoll = rollDice(random);
            System.out.println("============================================");
            System.out.println("Hasil Dadu : " + diceRoll);

            playerPosisi += diceRoll;

            handleSnakesAndLadders(playerPosisi, snakes, ladders);

            if (playerPosisi > posisifinal) {
                playerPosisi = (posisifinal - diceRoll);
            }
        }

        printBoard(playerPosisi, snakes, ladders);
        System.out.println("Selamat! Anda Telah Mencapai Posisi Akhir.");
        System.out.println("============================================");
 
        scanner.close();
      
    }

     static void initializeGame(int[] snakes, int[] ladders, Random random) {
        snakes[0] = random.nextInt(20) + 1;
        snakes[1] = random.nextInt(20) + 1;

        ladders[0] = random.nextInt(20) + 1;
        ladders[1] = random.nextInt(20) + 1;
    }

     static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }

     static void handleSnakesAndLadders(int playerPosisi, int[] snakes, int[] ladders) {
        if (contains(snakes, playerPosisi)) {
            System.out.println("Oops- Anda menemui Ular! Mundur 2 langkah.");
            playerPosisi -= 2;
        } else if (contains(ladders, playerPosisi)) {
            System.out.println("Hore! Anda menemui Tangga. Maju 3 langkah.");
            playerPosisi += 3;
        }
    }

     static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

     static void printBoard(int playerPosisi, int[] snakes, int[] ladders) {
        System.out.println("Posisi Pemain Berada Di Kotak ke - " + playerPosisi);

        for (int i = 1; i <= 100; i++) {
            if (i == playerPosisi) {
                System.out.print(" P ");
            } else if (contains(snakes, i)) {
                System.out.print(" S ");
            } else if (contains(ladders, i)) {
                System.out.print(" L ");
            } else {
                System.out.print( " - ");
            }

            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("============================================");
        
    }
}
