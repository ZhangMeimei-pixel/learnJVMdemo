import java.util.function.DoubleToIntFunction;
/*
(1)现在设置的代码补全是alt+/
(2)快速注释是command+/
(3)快速格式化代码 alt+command+L
(4)利用断点进入debug模式，观察栈的栈帧和局部变量表，进栈出栈操作

进入都out/production/learnJVMdemo文件夹下，有一个当前类的.class文件，对它进行反编译
在Terminal界面下输入反编译指令：javap -v StackFrameTest.class,观察反编译的输出结果
*/
public class TestStackFrame {

    public static void main(String[] args) {

        System.out.println("这是main即将执行");
        TestStackFrame tt = new TestStackFrame();
        try {
            tt.method1();
        }catch (Exception e){
            e.printStackTrace();
        }
        tt.method1();
        System.out.println();
        System.out.println("这是main执行完毕");
    }

    public  void method1(){
        System.out.println("这是method1即将执行");
        int i=10;
        int j=11;
        method2();
        //System.out.println(10/0); //这个会报出一个错误

        System.out.println("这是method1执行完毕");
    }
    public void method2(){
        System.out.println("这是method2即将执行");
        int i=10;
        int j=11;
        method3();
        System.out.println("这是method2执行完毕");
    }
    public void method3(){
        System.out.println("这是method3即将执行");
        int i=10;
        int j=11;
        System.out.println("这是method3执行完毕");
    }
}
