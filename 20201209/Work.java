import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;
import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-08
 * @time: 20:22
 */


public class Work {
    public static int fib3(int n){
       if(n==1){
           return n;
       }else{
           return n*fib3(n-1);
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int n= in.nextInt();
        int ret=fib3(n);
        System.out.println(ret);
    }


    public static int add(int n){
        int sum=0;
        if(n==1){
            return 1;
        }else{
            return n+add(n-1);
        }
    }
    public static void main14(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int n= in.nextInt();
        int ret=add(n);
        System.out.println(ret);
    }


    public static void splitTo(int num){
        if (num >9){
            splitTo(num/10);
        }
        System.out.println(num%10);
    }
    public static void main13(String[] args) {
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = in.nextInt();
        splitTo(num);
    }


    //求一个正整数各位和方法
    public static int splitToSum(int num){
        if (num < 10){
            return num;  //返回该整数的最高位上的数
        }
        return num % 10 + splitToSum(num / 10);  //对该整数的各位求和
    }
    public static void main12(String[] args) {
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = in.nextInt();  //接收一个正整数
        sum = splitToSum(num);  //sum接收调用求一个正整数各位和方法的返回值
        System.out.println(sum);
    }


    public static int fib(int n){
        int sum=0;
        if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }else{
            sum=fib(n-1)+fib(n-2);
        }
        return sum;
    }
    public static void main11(String[] args) {
        System.out.println("请输入求第几项：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=fib(n);
        System.out.println(sum);
    }


    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+"  ");
    }
    public static void hanota(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hanota(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanota(n-1,pos2,pos1,pos3);
    }
    public static void main10(String[] args) {
        hanota(1,'A','B','C');
        System.out.println();
        hanota(2,'A','B','C');
        System.out.println();
        hanota(3,'A','B','C');
    }


    public static int jumpfloor(int n) {
        // 如果是3阶的话，有4中跳法(111,12,21,3)，故这里加1
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else
            return jumpfloor(n - 1) + jumpfloor(n - 2) + jumpfloor(n - 3);
    }
    public static int abnormal_jumpfloor(int n) {
        int res = 0;
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else
            for (int i = 0; i < n; i++) {
                res += abnormal_jumpfloor(i);
            }
        return res;
    }
    public static void main9(String[] args) {
        System.out.println("请输入台阶n的值：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = jumpfloor(n);
        int res2 = abnormal_jumpfloor(n);
        System.out.println("正常跳：一共有" + res + "种跳法");
        System.out.println("变态跳：一共有" + res2 + "种跳法");
    }

    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        int ret = add(a, b);
        System.out.println("ret = " + ret);
        double a3 = 10.5;
        double b3 = 10.5;
        double c3 = 20.0;
        double ret3 = add(a3, b3, c3);
        System.out.println("ret3 = " + ret3);
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y, double z) {
        return x + y + z;
    }


    /*public static void main7(String[] args) {
        int a = 10;
        int b = 20;
        int ret = add(a, b);
        System.out.println("ret = " + ret);
        double a2 = 10.5;
        double b2 = 20.5;
        double ret2 = add(a2, b2);
        System.out.println("ret2 = " + ret2);
        double a3 = 10.5;
        double b3 = 10.5;
        int c3 = 20;
        double ret3 = add(a3, b3, c3);
        System.out.println("ret3 = " + ret3);
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static double add(double x, double y, double z) {
        return x + y + z;
    }*/


    public static int max2(int a,int b){
        int ret=Math.max(a,b);
        return ret;
    }
    public static int max3(int c,int d,int e){

        int ret1=max2(c,d);
        int ret2=Math.max(ret1,e);
        return ret2;
    }
    public static void main6(String[] args) {
        System.out.println(max3(10,20,30));
    }

    public static void main5(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        int i;
        int j;
        for(i=0;i<len;i++) {
            for (j = i + 1; j < len; j++) {
                if (arr[j] % 2 != 0) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
    }


    public static void main4(String[] args) {
        int sum=0;
        int ret=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i==1){
                ret=1;
            }else {
                 ret*= i;
            }
        }
        sum+=ret;
        System.out.println(sum);
    }

    public static int vib(int n){
        int ret=1;
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j==1){
                    ret=1;
                }else{
                    ret=j*ret;
                }
            }
            sum+=ret;
        }
        return sum;
    }
    
    public static void main3(String[] args) {
        System.out.println(vib(4));
    }
    
    public static int fib1(int n) {
        int f1=1;
        int f2=1;
        int f3=1;
        for (int i = 0; i <=n ; i++) {
           f3=f1+f2;
           f2=f3;
           f1=f2;
        }
        return f3;
    }
    public static void main2(String[] args) {
        System.out.println(fib1(10));
    }

    public static void main1(String[] args) {
        int [] arr={1,2,3,3,2,1,4,};
        int len=arr.length;
        int n=0;
        for (int i = 0; i < len; i++) {
            n=(arr[i]^n);
        }
        System.out.println(n);
    }
}
