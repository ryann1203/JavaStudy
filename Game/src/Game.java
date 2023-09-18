import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		Scanner oInDev; //oInDev라는 객체 선언
		int iInVal, iMod;
		
		System.out.println("1~999 사이의 정수를 입력하세요 : ");
		oInDev = new Scanner(System.in);
		iInVal = oInDev.nextInt();
		System.out.println("입력한 값은 [" + iInVal + "]입니다.");
		oInDev.close(); // 반드시 Scanner는 InDev close 할 것!! 안 그러면 25점 감점
		
		if(iInVal > 0 && iInVal < 1000){
			
			iMod = iInVal % 10;
			if(iMod == 3 || iMod == 6 || iMod == 9){
				System.out.print("짝");
			}
			iInVal = iInVal / 10;
			
			iMod = iInVal % 10;
			if (iMod == 3 || iMod == 6 || iMod == 9) {
				System.out.print("짝");
			}
			iInVal = iInVal / 10;
			
			iMod = iInVal % 10;
			if (iMod == 3 || iMod == 6 || iMod == 9) {
				System.out.print("짝");
			}
			iInVal = iInVal / 10;
		}
		
		else {
			System.out.println("1~999 사이의 수를 입력해주십시오.");
		}
	}

}
