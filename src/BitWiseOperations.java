import static java.awt.Cursor.TEXT_CURSOR;
import static java.awt.Cursor.WAIT_CURSOR;


public class BitWiseOperations {
    public static void main(String[] args) {
        int x = 10, y = 3;
        System.out.println(x ^ y);
        System.out.println(x & y);
        /**
        SimpleDateFormat bicim = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
        Date tarih = new Date();
        System.out.println(bicim.format(tarih));

        String s = "burak arıkboğa       ";
        System.out.println(s.trim().toUpperCase());
        System.out.println(s.replace('a', 'e'));     */

        double d = 0.0_000_001f * 1_000_000f;
        System.out.println("d = " + d);

        System.out.println(0.0_000_001F * 1_000_000F);

        System.out.println(.1 + .2);
        System.out.println(.1F + .2F);

        System.out.println(WAIT_CURSOR+TEXT_CURSOR);
    }
}
