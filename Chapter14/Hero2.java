public class Hero2 {
  String name;
  int hp;

  static int money;

  public static void setRandomMoney() {
    Hero.money = (int)(math.random() * 1000);
  }
}