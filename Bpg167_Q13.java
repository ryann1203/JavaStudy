import java.util.Scanner;

class Main {
    public static void main(String[] args) {

      for(int n = 1; n < 100; n++){
        int x1 = n % 10;
        int x2 = n / 10;

        if( x1 != 3 && x1 != 6 && x1 != 9 
            && x2 != 3 && x2 != 6 && x2 != 9){
              continue;
            }

        else{
        System.out.print(n + " 박수 ");
        
        if(x1 == 3 || x1 == 6 || x1 == 9){
          System.out.print("짝");
        }
        if(x2 == 3 || x2 == 6 || x2 == 9){
          System.out.print("짝");
        }
        System.out.println();
          
        } 

      }
    }
}
