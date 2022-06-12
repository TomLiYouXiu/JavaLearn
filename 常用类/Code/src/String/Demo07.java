package String;
//效率验证
public class Demo07 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        String s1="";
        for (int i = 0; i < 99999; i++) {
            s1+=i;
        }
        System.out.println(s1);
        long endTime=System.currentTimeMillis();
        System.out.println("用时："+(endTime-startTime));
        StringBuffer stringBuffer = new StringBuffer();
        long startTime2=System.currentTimeMillis();
        for (int i = 0; i < 99999; i++) {
            stringBuffer.append(i);
        }
        System.out.println(stringBuffer.toString());
        long endTime2=System.currentTimeMillis();

        System.out.println("用时："+(endTime2-startTime2));
    }
}
