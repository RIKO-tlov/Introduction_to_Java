import java.util.HashSet;
import java.util.Set;

public class Main3 {
  public static void main(String[] args) {
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤"); //重複しれ「赤」を格納しようとして無視される
    System.out.println("色は" + colors.size() + "種類");
  }
}