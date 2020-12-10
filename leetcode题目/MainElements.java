import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-10
 * @time: 19:22
 */
public class MainElements {
    //自己的
    public static int majorityElement(int[] nums){
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            if(nums[0]==nums[1]){
                return nums[0];
            }else{
                return -1;
            }
        }
        Arrays.sort(nums);
        int left=0;
        int right=len-1;
        int mid=left+(right-left)/2;
        int count=0;
        for (int i = 0; i <len ; i++) {
            if(nums[mid]==nums[i]){
                count++;
            }
            if(count>mid){
                return nums[mid];
            }
        }
        return -1;
    }

    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);//数组就会排好序
        //int[] ret=new
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+len/2;j<len;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static int majorityElement1(int[] nums) {
        int len =nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            if(nums[0]==nums[1]){
                return nums[0];
            }else{
                return -1;
            }
        }
        Arrays.sort(nums);
        int left=0;
        int right=len-1;
        int mid=left+(right-left)/2;
        if(nums[left]==nums[mid]){
            return nums[left];
        }
        if(nums[right]==nums[mid]){
            return nums[right];
        }
        if(nums[mid]==nums[mid-1]){
            return nums[mid];
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums={1,2,5,9,5,9,5,5,5};
        int ret=majorityElement(nums);
        System.out.println(ret);
    }
}
