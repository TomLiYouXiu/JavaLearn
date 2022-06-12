package Exception;

public class Test {
    public static void main(String[] args) {
            new Test().test(1,0);


    }
    public void a(){b();};
    public void b(){a();};
    //假设这个方法处理不了这个异常，可以在方法上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();//主动抛出异常,一般在方法中使用
        }
        System.out.println(a/b);
    }
}
/*
        int a=1;
        int b=0;
 try {//try监控区域
            if(b==0){
                throw new ArithmeticException();//主动抛出异常
            }
            System.out.println(a/b);
//            new Test().a();
        }catch (Throwable e){//catch(想要捕获的异常类型) 捕获异常
            System.out.println("程序出现异常，b不能为0");
        }finally {//finally处理善后工作
            System.out.println("finally");
        }
        //可以不要finally 假设IO，资源关闭
 */