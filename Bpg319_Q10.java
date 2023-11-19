import java.util.Scanner; 

class Main {

  public abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    public abstract String get(String key);
    public abstract void put(String key, String value);
    public abstract String delete(String key);
    public abstract int length();
  };

  public class Dictionary extends PairMap{
    public Dictionary(int num){
      keyArray = new String[num];
      valueArray = new String[num];
    }

  @Override
  public String get(String key){
      
        for(int i = 0; i < keyArray.length; i++){
          if (keyArray[i] != null && keyArray[i].equals(key)) {
                return valueArray[i];
        }
        return null;
      
    }

  @Override
  public void put(String key, String value){
      for(int i = 0; i < keyArray.length; i++){
        if (keyArray[i] == null || keyArray[i].equals(key)) {
                keyArray[i] = key;
                valueArray[i] = value;
                return;
      }
    }
  };
  
  @Override
  public String delete(String key) {
      for (int i = 0; i < keyArray.length; i++) {
          if (keyArray[i] != null && keyArray[i].equals(key)) {
              String deletedValue = valueArray[i];
              keyArray[i] = null;
              valueArray[i] = null;
              return deletedValue;
          }
      }
      return null; // Key가 없을 경우 null 반환
  }

  @Override
      public int length() {
          int count = 0;
          for (String key : keyArray) {
              if (key != null) {
                  count++;
              }
          }
          return count;
      }
  }

  public class DictionaryApp{
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));

    }
}
