public class Person {
  int age;
  public void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException ("年齢は0以上の数にすべきです。指定値=" + age);
    }
    this.age = age; //間違いなら。フィールドに値をセット
  }
}