import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-10
 * @time: 21:06
 */
//平均值
public class Avg {
    public static int[] putNum(int[] arr) {
        for(int i = 0;i < 100; i++){
            arr[i] = i + 1;
        }
        return arr;
    }
    public static void main (String[] args) {
        int[] arr = new int[100];
        System. out. println(Arrays. toString(putNum(arr)));
    }


    public static int printArray(int[] arr) {
        int len = arr.length;
        int i;
        int ret=0;
        for (i = 0; i < len; i++) {
            ret=arr[i];
            System.out.println(ret);
        }
        return 0;
    }
    public static void main4(String[] args) {
        int [] arr={1,2,3};
        printArray(arr);
    }


    public static int[] transform(int[] arr) {
        int[] arr1 = new int[3];
        int len = arr.length;
        int i;
        for (i = 0; i < len; i++) {
            arr1[i] = arr[i] * 2;
        }
        return arr1;
    }
    public static void main3(String[] args) {
        int [] arr={1,2,3};
        int [] n=transform(arr);
        System.out.println(Arrays.toString(n));
    }


    public static int And(int [] arr){
        int sum=0;
        int len =arr.length;
        for (int i = 0; i <len ; i++) {
            sum+=arr[i] ;
        }
        return sum;
    }
    public static void main2(String[] args) {
        int [] arr={1,2,3,4,5};
        int ret=And(arr);
        System.out.println(ret);
    }


    public static int avg(int [] arr,int len){
        int sum=0;
        for (int i = 0; i <len ; i++) {
            sum+=arr[i] ;
        }
        return sum/len;
    }
    public static void main1(String[] args) {
        int [] arr={1,2,3,4,5};
        int len=arr.length;
        int ret=avg(arr,len);
        System.out.println(ret);
    }
}
