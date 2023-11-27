import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");

    String string = scanner.nextLine();

    for(int i = 1; i < string.length(); i++){

      System.out.print(string.substring(i, string.length() ));
      System.out.println(string.substring(0, i));

    }

    scanner.close();

  }
}
