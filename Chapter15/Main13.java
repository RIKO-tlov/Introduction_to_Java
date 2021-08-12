//15-1
public class Main13 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append(i + l).append(",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
  }
}

//15-2
public String concatPath(String folder, String file) {
  if (!folder.endsWith("¥¥")) {
    folder += "¥¥";
  }
  return folder + file;
}

/*15-3
(1).*
(2)A¥d[1,2]
(3)U[A-Z]{3}
*/

//15-4
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    //①現在の日時をDate型で取得
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    //②取得した日時情報をcalendarにセット
    c.setTime(now);
    //③Calendarから「日」の情報を取得
    int day = c.get(Calendar.DAY_OF_MONTH);
    //④取得した値に100を足してCalendarの「日」にセット
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    //⑤Calendarの日付情報をDate型に変換
    Date future = c.getTime();
    //⑥指定された形式で表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}

//15-5
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    LocalDate future = now.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}