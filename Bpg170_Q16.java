import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("컴퓨터와 가위바위보 게임을 합니다.");

    while(true){
    System.out.print("가위 바위 보! >> ");
    String choice = scanner.nextLine();

    if(choice.equals("그만"))
      break;
    
    String str[] = {"가위", "바위", "보"};
    int n = (int)(Math.random()*3);


    System.out.print("사용자 = " + choice);
    
    if(n == 0)
      System.out.print(", 컴퓨터 = " + str[0]);

    if(n == 1)
      System.out.print(", 컴퓨터 = " + str[1]);

    if(n == 2)
      System.out.print(", 컴퓨터 = " + str[2]);

    System.out.println();
      if(str[n].equals(choice))
      System.out.println("비겼습니다");
      
    else if((choice.equals("가위") && str[n].equals("보")) ||
           (choice.equals("바위") && str[n].equals("가위")) ||
           (choice.equals("보") && str[n].equals("바위")))
    {
      System.out.println("사용자가 이겼습니다!");
        } 
      
    else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
    };
    
    System.out.println("게임을 종료합니다");
    System.out.println();
    
    scanner.close();
}
}
