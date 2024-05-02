package utils;

public class TestMethodeStatic {
  public static void main(String[] args) {
    String chaine = "12";
    Integer number = Integer.parseInt(chaine);
    Integer a = 7;
    Integer b = 27;
    
    System.out.println(number);
    System.out.println(Integer.max(a, b));
  }
}
