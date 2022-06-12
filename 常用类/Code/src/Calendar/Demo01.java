package Calendar;

import java.util.Calendar;

public class Demo01 {

    public static void main(String[] args) {
        //创建Calendar对象 因为修饰符protected受保护
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());

        //获取时间信息
        //获取年
        int year = calendar.get(calendar.YEAR);
        System.out.println(year);
        //月
        int month = calendar.get(calendar.MONTH);
        System.out.println(month);
        //日
        int day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(day);
        //小时
        int hour=calendar.get(calendar.HOUR);
        System.out.println(hour);



    }
}
