/*
通过分析i++和++i产生的字节码指令，来分析i++和++i的区别
 */
public class TestIPlusPlus {
    public static void main(String[] args) {
        TestIPlusPlus tt = new TestIPlusPlus();
        tt.testIPlusPlus();
        tt.testPlusPlusI();
    }

    //观察i++生成的字节码指令
    public void testIPlusPlus() {
        int i = 1;
        int j = i++;
        System.out.println("testIPlusPlus的结果为： " + i);

        System.out.println("testIPlusPlus的j结果为： " + j);

    }

    //观察++i的字节码指令
    public void testPlusPlusI() {
        int i = 1;
        int j = ++i;
        System.out.println("testPlusPlusI的i结果为： " + i);


        System.out.println("testPlusPlusI的j结果为： " + j);

    }

    //++i和i++大集合
    public void add() {
        int i1 = 1;
        ++i1;

        int i2 = 1;
        i2++;


        int i3 = 1;
        int i4 = i3++;

        int i5 = 1;
        int i6 = ++i5;

    }
}
