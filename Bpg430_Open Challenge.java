import java.util.Scanner;
import java.util.Vector;

//Word.java
class Word {
  private String eng, kor;
  public Word(String eng, String kor){
    this.eng = eng;
    this.kor = kor;
  }

  public String getEng(){
    return eng;
  }

  public String getKor(){
    return kor;
  }
}


//WordQuiz.java
public class WordQuiz {
  public static void main(String[] args) {
    Vector<Word> v = new Vector<Word>();
    Math.random();  
    Scanner scanner = new Scanner(System.in);    
      
    v.add(new Word("love", "사랑"));
    v.add(new Word("animal", "동물"));
    v.add(new Word("society", "사회"));
    v.add(new Word("baby", "아기"));
    v.add(new Word("bear", "곰"));
    v.add(new Word("trade", "거래"));
    v.add(new Word("person", "사람"));
    v.add(new Word("picture", "그림"));
    v.add(new Word("computer", "컴퓨터"));
    v.add(new Word("winter", "겨울"));
    
    while(true){
      int wordnum = (int)(Math.random()*10); //10개의 단어 중 어느 단어를 문제 낼 지 정하기
      int ans = (int)(Math.random()*4) + 1;  //정답을 입력할 보기 정하기
      int notwordnum;      
      String example[] = new String [4]; //보기용 배열 생성
      
      Word word = v.get(wordnum);
      System.out.println(word.getEng());

      for(int i = 1; i < 5; i++){
        if(i == ans){
          example[i - 1] = word.getKor();
          System.out.print(" " + i + " " + word.getKor()); //정답 보기 출력
        }

        else{
          do{
             notwordnum = (int)(Math.random()*10); //지금의 정답과 틀린 정답지가 같다면 다시 고르기
          }while(wordnum == notwordnum);
            
          Word notword = v.get(notwordnum);
          example[i - 1] = notword.getKor();
          System.out.print(" " + i + " " + notword.getKor()); //정답이 아닌 보기들 출력
        }        
      }

      // 보기끼리 중복 검사하려다가 실패한 흔적..      
      /*for(int j = 0; j < 4; j++){
        for(int k = 0; k < 4; k++){
            do{
              int num2 = (int)(Math.random()*10);
              example[j] = v.get(num2).getKor();
            }while(example[j] == example[k]);
        }
      }*/
      
      System.out.print(" >> ");
      int answer = scanner.nextInt();
      
      if(answer == -1)
        break;
      else if(answer == ans)
        System.out.println("정답입니다!\n");
      else
        System.out.println("오답입니다!\n");
    }

    System.out.println("\n종료합니다.");
    scanner.close();
  }
}
