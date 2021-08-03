//10-1 2, 3, 5

/*10-2
(1)ア Item イ SmartPhone
(2)ウ Vehicle エ ElectricCar
(3)オ Book カ EnglishDictionary
*/

//10-3
public class PoisonMatango extends Matango {
  int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("さらに毒をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    }
  }
}