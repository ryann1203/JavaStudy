import java.util.Scanner;

class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      char Arr[][] = new char[5][15];

      for(int i = 0; i < 5; i++){
        String str = scanner.nextLine();

        for(int j = 0; j < str.length(); j++){
          Arr[i][j] = str.charAt(j);
        }
      }

      for(int i = 0; i < 15; i++){
        for(int j = 0; j < 5; j++){
          if(Arr[j][i] == ' ' || Arr[j][i] == '\0')
            continue;

          System.out.print(Arr[j][i]);
        }
      }

      scanner.close();
    }
}
