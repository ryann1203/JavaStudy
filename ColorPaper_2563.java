import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("색종이의 수 : ");
    int num = scanner.nextInt();
    int count = 0;
    int sector[][] = new int [100][100];

    for (int i=0;i<10;i++) {
      for (int j=0;j<10;j++) {
        sector[i][j]=0;
      }
    }
    
    for(int i = 0; i < num; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt(); 

      for(int j = 0; j < 10; j++){
        sector[x+j][y+j] = 1;
        
      }
      
    }
    for(int i = 0; i < 100; i ++)
      for(int j = 0; j < 100; j++){
        if (sector[i][j] == 1)
          count++;
      }


    System.out.println(count);
    scanner.close();
   
}
}
