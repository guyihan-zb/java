import sun.security.util.Cache;

import java.io.SyncFailedException;
import java.util.AbstractCollection;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-05
 * @time: 09:57
 */
public class Work {
    public static void main(String[] args) {
        System.out.print("欢迎使用! ");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你的密码: ");
            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            if (password.equals("123456")) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("输入错误，你还有" + (2 - i) + "次机会");
            }
        }
        System.out.println("退出程序");
    }


    public static void main14(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i;
        int j;
        for (i = 1; i <=n ; i++) {
            for ( j = 1; j <=i ; j++) {
                System.out.print(j);
                System.out.print('*');
                System.out.print(i);
                System.out.print('=');
                System.out.print(i*j+"  ");
            }
            System.out.println();
        }
    }

    public static void output(int num){
        //如果num > 9说明位数大于1位，则将n / 10（去掉最后一位）递归调用output1
        //如果num <= 9了说明就剩一位，num % 10输出这一位，并从堆栈中依次输出其他位数
        if(num > 9){
            output(num / 10);
        }
        System.out.printf("%d ", num % 10);
    }
    public static void main13(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        output(num);
    }


    public static void main12(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入数字：");
        int value=scan.nextInt();
        System.out.println("偶数序列：");
        for(int i=31;i>0;i-=2){
            System.out.print((value>>i)&1);
        }
        System.out.println("");
        System.out.println("奇数序列：");
        for(int i=30;i>=0;i-=2){
            System.out.print((value>>i)&1);
        }
    }

    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        for (int i = 0; i <32 ; i++) {
            if(((num >> i) & 1) == 1) {  //i是右移的位数，右移之后与1看结果是否是1
                count++;
            }
        }
        System.out.println("count:"+ count);
    }

    public static void main10(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        for (int i =a*b; i >0 ; i--) {
            if(a%i==0&&b%i==0){
                System.out.println(i);
                break;
            }
        }
    }


    public static void main9(String[] args) {
        double num=0.0;
        for (int i =1 ; i <=100 ; i++) {
            if (i % 2 == 0) {
                num+=-(1.0/i);
            }else{
                num+=(1.0/i);
            }
        }
        System.out.println(num);
    }

    public static void main8(String[] args) {
        int i=100;
        int a,b,c;
        for(;i<1000;i++){
            a=i/100;
            b=i/10%10;
            c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i+"是水仙花数");
            }
        }
    }


    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100) + 1;
        while (true) {
            int inputNum = scanner.nextInt();
            if (inputNum < randNum) {
                System.out.println("小");
            } else if (inputNum > randNum) {
                System.out.println("大");
            } else {
                System.out.println("==");
                break;
            }
        }
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i=0;
        int j=0;
        for (i = 0; i <num; i++) {
            for (j = 0; j <num; j++) {
                if(i==j){
                    System.out.print('*');
                }else if(j==num-i-1){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num>=0&&num<=18){
            System.out.println("少年");
        }
        else if(num>18&&num<=28){
            System.out.println("青年");
        }
        else if(num>28&&num<=55){
            System.out.println("中年");
        }
        else{
            System.out.println("老年");
        }
    }


    public static void main4(String[] args) {
        Scanner ret=new Scanner(System.in);
        int num=ret.nextInt();
        int i;
        for (i = 2; i <num ; i++) {
            if(num%i==0){
                System.out.println(num+"不是素数");
                break;
            }
        }
        if(i==num){
            System.out.println(num+"是素数");
        }
    }


    public static void main3(String[] args) {
        int j;
        for (int i = 0; i <=100 ; i++) {
            for ( j = 2; j <i ; j++) {
                if(i%j==0) {
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }

    public static void main2(String[] args) {
        int i=1000;
        for(;i<=2000;i++){
            if(i%400==0||(i%4==0&&i%100!=0)){
                System.out.println(i);
            }
        }
    }

    public static void main1(String[] args) {
        int count=0;
        int i=1;
        for ( i = 1; i <=100 ; i++) {
            if(i%10==9) {
                count++;
            }
            if(i/10==9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
