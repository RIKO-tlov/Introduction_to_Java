/* 4-1
public class Main9 {
  public static void main(String[] args) {
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];
  }
}
*/

//4-2
public class Main9 {
  public static void main(String[] args) {
    int[] moneyList = {121902, 8302, 55100};
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    for (int m : moneyList) {
      System.out.println(m);
    }
  }
}

/*4-3
5行目：NullPointerException
6行目：ArrayIndexOutOfBoundsException
*/

//4-4
public class Main9 {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int i : numbers) {
      if (i == input) {
        System.out.println("あたり!");
      }
    }
  }
}


