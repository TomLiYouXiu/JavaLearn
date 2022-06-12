package BigDecimal;

import java.math.BigDecimal;

public class Demo01 {
    public static void main(String[] args) {
        //BigDecimal 大的浮点数精确计算
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.9");

        //减法
        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);
        //加法
        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);
        //乘法
        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println(multiply);
        //除法
        BigDecimal divide = new BigDecimal("1.4")
                .subtract(new BigDecimal("0.5"))
                .divide(new BigDecimal("0.9"));
        System.out.println(divide);
    }
}
