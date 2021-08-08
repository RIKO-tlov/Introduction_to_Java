public class Main {
  public static void main(String[] args) {
    Empty e = new Empty();
    String s = e.toString();
    System.out.println(s);

    Object o1 = new Empty();
    Object o2 = new Hero();
    Object o3 = "こんにちは";
  }
  public void printAnything(Object o) {
    //何型でもいいから、引数を一つ受け取り画面に表示
    System.out.println(o.toString());
  }
}