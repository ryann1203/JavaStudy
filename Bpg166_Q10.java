import java.util.Random;

class Main {
  public static void main(String[] args) {
    int array[][] = new int[4][4];

    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        array[i][j] = (int)(Math.random()*10) + 1;
      }
    }
    
    for(int i = 0; i  < 6; i++){
      int row, col;
      row = (int)(Math.random() * 4);
      col = (int)(Math.random() * 4);
      
      while(array[row][col] == 0){
        row = (int)(Math.random() * 4);
        col = (int)(Math.random() * 4);
      }
      
      array[row][col] = 0;
    }

    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

  }
}
