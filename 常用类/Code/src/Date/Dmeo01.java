package Date;

import java.util.Date;

public class Dmeo01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.toLocaleString());
        Date date2 = new Date(date1.getTime()-60*60*24*1000);
        System.out.println(date2.toLocaleString());
        System.out.println(date2.before(date1));
        System.out.println(date1.after(date2));

    }
}
