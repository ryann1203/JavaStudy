import java.util.Scanner;

public class Main {

  private int a;
  private int b;
  
  public abstract class Calc{ //추상클래스 선언하기
    public abstract int Add(int a, int b);
    public abstract int Sub(int a, int b);
    public abstract int Mul(int a, int b);
    public abstract int Div(int a, int b);
  };

  public class CalcImpl extends Calc{ //Calc 클래스를 상속받아서 서브클래스 구현하기
    @Override
    public int Add(int a, int b){
      return a + b;
    };

    @Override
    public int Sub(int a, int b){
      return a - b;
    };

    @Override
    public int Mul(int a, int b){
      return a * b;
    };

    @Override
    public int Div(int a, int b){
      if(b == 0){
        System.out.println("0으로 나눌 수 없습니다.");
        return 0;
      }
      else
        return a / b;
    };
  }

  public void setValue(int a, int b){
    this.a = a;
    this.b = b;
  };

  int calculate(String operator){
        int result = 0;

        CalcImpl calcimpl = new CalcImpl();

        switch (operator) { //사용자가 입력한 연산자에 따라 수행하기
            case "+":
                result = calcimpl.Add(a, b);
                break;
            case "-":
                result = calcimpl.Sub(a, b);
                break;
            case "*":
                result = calcimpl.Mul(a, b);
                break;
            case "/":
                result = calcimpl.Div(a, b);
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
        }

        return result;
  }
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("두 정수와 연산자를 입력하시오 >> ");
      int a = scanner.nextInt(); //첫번째 숫자 인식
      int b = scanner.nextInt(); //두번째 숫자 인식
      String operator = scanner.next(); //연산자 인식

      Main cal = new Main();

      cal.setValue(a, b);

      int result = cal.calculate(operator); //연산자에 맞는 식 수행
      System.out.println("결과: " + result);


      scanner.close();
    }
}
