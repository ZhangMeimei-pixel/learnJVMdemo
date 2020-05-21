/*
*观察线程运行时，栈帧中的操作数栈和局部变量表的变化
* 线程运行时，对应一个线程栈，每一个方法调用都对应着线程栈中的一个栈帧
* 一个栈帧中包括局部变量表、操作数栈、动态链接、方法返回地址和一些附加信息
 */
public class OperatorStackTest {
    public void testAddOperatorStack() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    public int getSum(){
        int i = 12;
        int j = 5;
        int k = i + j;
        return k;

    }

    public void testGetSum() {
        int i = getSum();
        int j = 16;
    }

}

