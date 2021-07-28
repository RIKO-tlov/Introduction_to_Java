/*3-1
① weight == 60
② 2 * (age1 + age2) > 60
③ age % 2 == 1
④ name.equals("湊")
*/

//3-2 C, D, E

//3-3

public class Main6 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "鰻";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
    }
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}

/*3-4 elseの横に波カッコがないから。else文のプロックがDVDを見ますで終了している。
      elseの横から{}で囲む。
*/

//3-5

public class Main6 {
  public static void main(String[] args) {
    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更＞");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }
  }
}

public class Main6 {
  public static void main(String[] args) {
    System.out.println("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.println("０～９の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (ans == num) {
        System.out.println("あたり！");
        break; //内側の繰り返しプロックをnum以外だったら即座に中断する
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}
