import java.util.Scanner;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {

    int max = 0;
    int num = 0;
    
    Vector<Integer> v = new Vector<Integer> ();
    System.out.print("정수(-1이 입력될 때까지)>> ");

    Scanner scanner = new Scanner(System.in);

    while(true){
      if(scanner.nextInt() == -1)
        break;

      v.add(scanner.nextInt());
    }

    for(int i = 0; i < v.size(); i++){
      num = v.get(i);  //get이랑 elementAt의 차이??

      if(num > max){
        max = num;
      }
    }

    System.out.println("가장 큰 수는" + max);
    scanner.close(); //스캐너를 닫는다.
  }
} 
