package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        //1.创建SimpleDateFormat对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH：mm：ss");
        //2.创建Date
        Date date = new Date();
        //3.格式化
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        //解析（把字符装换日期）
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = null;
        try {
            parse = simpleDateFormat2.parse("1990/05/05");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse.toLocaleString());
    }
}
