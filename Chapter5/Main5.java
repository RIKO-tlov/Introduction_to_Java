public class Main5 {
  //int型配列を受け取り、配列内の要素全てに１を加える
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}

//戻り値が配列の場合
public class Main5 {
  //int型配列を作成して戻すメソッド
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);
    }
  }
}

