import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 몇개? : ");
        int howmuch = scanner.nextInt();
        int numRows = howmuch / 10;
        int remainder = howmuch % 10;
        int max = 100; // 랜덤 숫자의 범위 (1부터 max까지)

        if (remainder > 0) {
            numRows++;
        }
        
        int[][] num = new int[numRows][10];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
              if(howmuch > 0){
                int randomNumber;
                boolean isDuplicate;

                do {
                    isDuplicate = false;
                    randomNumber = random.nextInt(max) + 1;

                    // 중복 체크
                    for (int x = 0; x < i; x++) {
                        for (int y = 0; y < 10; y++) {
                            if (num[x][y] == randomNumber) {
                                isDuplicate = true;
                                break;
                            }
                        }
                    }
                } while (isDuplicate);

                num[i][j] = randomNumber;
                System.out.print(" " + num[i][j]); 
                howmuch--; }
            }
            System.out.println();
        }

        scanner.close();
    }
}
