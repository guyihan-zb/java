/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-14
 * @time: 20:47
 */

import java.util.Arrays;

/**
 * 20201213 work
 *
 */

public class Work {
    public static void copyOf(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }


    public static String myToString(int [] arr){
        int len=arr.length;
        String ret="[";
        for (int i = 0; i <len ; i++) {
            ret=ret+arr[i];
            if(i!=len-1){
                //ret=ret+arr[i]+", ";
                ret=ret+", ";
            }
        }
        ret+="]";
        return ret;
    }



    public static int binarySearch(int [] arr,int key){
        int len=arr.length;
        int left=0;
        int right=len-1;
        int mid=(left+right)/2;
        for (int i = 0; i <len ; i++) {
            while (left<=right){
                if(arr[mid]==key){
                    return mid;
                }else if(arr[mid]>key){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
        }
        return -1;
    }



    public static boolean isUp(int [] arr){
        int len=arr.length;
        for (int i = 0; i <len-1 ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void BullerSort(int [] arr){
        int len=arr.length;
        boolean flag=false;
        for (int i = 0; i <len-1 ; i++) {
            for (int j = 0; j <len-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }
            }
        }
        if(!flag){
            return;
        }
    }
    public static void main(String[] args) {
        int [] arr={3,5,1,6,9,7,8,2};
        copyOf(arr);
    }
}
