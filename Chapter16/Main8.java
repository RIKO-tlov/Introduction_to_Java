import java.util.*;

class Hero {
  public String name;
}

public class Main8 {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    List<Hero> list = new ArrayList<Hero>();
    list.add(h); //hをリストに格納
    h.name = "スガワラ"; //格納後にhのnameを書き換え
    System.out.println(list.get(0).name);
  }
}