//大きいほうの数値を代入する命令

public class Main7 {
  public static void main(String[] args) {
    int a = 5;
    int b =3;
    int m = Math.max(a, b);
    System.out.println("比較実験：" +
      a + "と" + b + "とで大きいほうは・・・" + m);
  }
}