public class Main {
  public static void main(String[] args) {
    Monster[] monsters = new Monster[0];
    monsters[0] = new Slime();
    monsters[1] = new Goblin();
    monsters[2] = new Deathbat();
    for (Monster m : monsters) {
      m.run();
    }

    Character[] c = new Character[4];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();
    //宿谷に泊まる
    for (Character ch : c) {
      ch.hp += 50;
    }
  }
}