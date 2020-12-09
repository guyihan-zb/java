import java.util.Scanner;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-09
 * @time: 14:17
 */
public class test {
    public static int splitTo(int num){
        if (num >9){
            splitTo(num/10);
        }
        System.out.println(num%10);
        return 0;
    }
    public static void main(String[] args) {
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = in.nextInt();
        splitTo(num);
    }


    public static int jumpfloor(int n) {
        // 如果是2阶的话，有2中跳法(11,2)，故这里加1
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            return jumpfloor(n-1)+jumpfloor(n-2);
    }
    public static int abnormal_jumpfloor(int n) {
        int res = 0;
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            for (int i = 0; i < n; i++) {
                res += abnormal_jumpfloor(i);
            }
        return res;
        /*if (n <= 1) {
            return 1;
        } else {
            res= 2 * abnormal_jumpfloor(n - 1);
            return res;
        }*/

    }
    public static void main1(String[] args) {
        System.out.println("请输入台阶n的值：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = jumpfloor(n);
        int res2 = abnormal_jumpfloor(n);
        System.out.println("正常跳：一共有" + res + "种跳法");
        System.out.println("变态跳：一共有" + res2 + "种跳法");
    }
}
