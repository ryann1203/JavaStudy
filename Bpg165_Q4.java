import java.util.Scanner;

class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
      String s = scanner.next();  //next 함수에서는 char형을 바로 scanner로 받지 못해서 string으로 입력받기
      char c1 = s.charAt(0);  //string으로 받은 문자열의 첫번째 문자
      int c2 = (int) c1;  //문자열의 첫번째 문자를 아스키코드로 변환하여 사용

      for(int i = c2; i > 96; i--){  // 맨 뒤에서부터 아스키코드 하나씩 감소 
        for(int j = 97; j < i+1; j++){  // 알파벳 a부터 하나씩 올라가면서 출력
          System.out.print((char)j + " ");
        }
        
        System.out.println();
      }
        

      scanner.close();
    }
}
