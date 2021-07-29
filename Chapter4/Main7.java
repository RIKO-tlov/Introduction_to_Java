public class Main7 {
  public static void main(String[] args) {
    boolean judge = true;
    if (judge == true) {
      int[] array = {1, 2, 3};
      //変数の寿命はブロックが終了するまでなので、どこにも参照されない状態でメモリに残ってしまう
      //Javaはガベージコレクションとういしくみでプログラムが生み出したメモリ上のゴミを自動的に探して片づけてくれる
    }
  }
}