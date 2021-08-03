//宣言時にfinalがつけられているクラスは継承できない
public final class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.run();
    SuperHero sh = new SuperHero();
    sh.run();
  }
}