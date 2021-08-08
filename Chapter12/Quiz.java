/*12-1
(1) Sword Item Sword Item (2)Monster Slime Slime Monster
*/

//12-2 ①a() ②AaBa

//12-3 ①Y[] ②以下

public class Main {
  public static void main(String[] args) {
    Y[] array = new Y[2];
    array[0] = new A();
    array[1] = new B();
    for (Y y : array) {
      y.b();
    }
  }
}
