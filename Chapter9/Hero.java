public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は" + sword.name + "で攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero(String name) { //コンストラクタ①
    this.hp = 100;  //hpフィールドを100で初期化
    this.name = name; //引数の値でnameフィールドを初期化
  }
  public Hero() { //コンストラクタ②
    this("ダミー"); //コンストラクタ①を呼び出すようJVMに依頼する
  }
}