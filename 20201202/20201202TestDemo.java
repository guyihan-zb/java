/**
 * Created with IntelliJ IDEA.
 * Description:
 *     这只是一个demo
 * User: GaoBo
 * Date: 2020-12-02
 * Time: 19:43
 */
//行注释  ctr+shift+/   注释   取消注释
/*
块注释
 */

/**
 * 文档注释
 * 危机感
 */
public class TestDemo {

    /**
     * 类型的提升：
     *    小于4个字节的时候,
     *    byte  short
     */
    public static void main(String[] args) {
        /*byte b = 10;
        byte b2 = 20;
        byte b3 = (byte)(b+b2);
        System.out.println(b3);
*/
        /*int a = 10;
        long b = 10L;
        int c = (int)(a+b);
        System.out.println(c);
        */

        short s = 10;
        //s = s+20;
        s += 20;//+=  复合运算符
        System.out.println(s);
    }

    public static void main11(String[] args) {
        int a = 10;//4
        long b = 10;///8

        //a = (int)b;
        b = a;

        int a2 = 10;
        double d = 19.8;
        //a2 = (int)d;
        d = a2;

    }

    /**
     * 常量：
     *     在程序运行的过程当中  不能够改变的量
     * 1、字面常量
     *     10  10L   "HELLO" 18.9  89.7f
     * 2、被final修饰的变量
     *    只能初始化1次
     * @param args
     */
    public static void main10(String[] args) {
        final int a;
        a = 99;
        System.out.println(a);
    }

    public static void main9(String[] args) {
        int _a = 10;
        System.out.println(_a);
        //int 3a = 10;
        int $a = 10;
        int a$b = 10;
        //见名思意    小驼峰  max    maxNum
    }

    public static void main8(String[] args) {
        String str = " \\hello\\";
        System.out.println(str);
        // "hello"   \hello\

        int a = 10;
        System.out.println(a+str);
        //拼接   任何类型的数据 和 字符串用+进行连接
        int b = 20;
        //a = 10,b = 20
        System.out.println("a = "+a + ",b= "+ b);

        String ret = "result = ";
        System.out.println( a + b);
    }

    public static void main7(String[] args) {
        //true     false
        // JVM没有明确规定
        // 有些资料书 1个字节    1bit
        boolean flg = true;
        System.out.println(flg);

    }

    public static void main6(String[] args) {
        //2        -2^15  2^15 -1  Short
        short sh = 10;
        System.out.println(sh);
    }

    public static void main5(String[] args) {
        //字节类型   1个字节   8bit   -128  127
        // Byte
        byte b = 127;
        System.out.println(b);
    }

    public static void main4(String[] args) {
        //字符类型  2个字节  16   Character
        char ch = '高';
        System.out.println(ch);

        char ch2 = 9971;//unicode字符集
        System.out.println(ch2);

    }


    public static void main3(String[] args) {
        /**
         * 8
         * 包装类：Double
         * 任何小数 没有一个精确的数字
         */
        double d = 1.1;
        double d2 = 1.1;
        System.out.println(d*d2);//1.21

        //4
        float f = 12.5F;
        System.out.println(f);
    }

    public static void main2(String[] args) {
        /**
         * 长整型： 8      64     -2^63  2^63 -1
         *
         */
        long a = 10L;
        System.out.println(a);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
    /**
     *
     * @param args  java运行时命令行参数
     */
    public static void main1(String[] args) {
        /**
         * 4个字节 和 多少位机器没有关系
         * Integer:看做是 int的 plus
         *         包装类  具体会在 后面详细讲到
         * int a = 2147483648; 编译报错
         */
        int a = Integer.MAX_VALUE+1;
        System.out.println(a);
        /*System.out.println(a);//a.sout
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);*/
    }
}
