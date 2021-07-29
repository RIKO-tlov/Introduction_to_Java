public class Main {
  public static void methodA() {
    System.out.println("methodA");
    methodB();
  }
  public static void methodB() {
    System.out.println("methodB");
  }
  //プログラムが必ずmainメソッドから動き始める
  public static void main(String[] args) {
    methodA();
  }
}